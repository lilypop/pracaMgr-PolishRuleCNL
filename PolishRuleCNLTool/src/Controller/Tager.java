package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

/**
 * 
 * @author wposlednicka
 *
 */
public class Tager {

	static private final String nlprestURL="http://ws.clarin-pl.eu/nlprest/base/";
	
	public static String nlpFileUpload(String text) throws IOException {
		 return ClientBuilder.newClient().target(nlprestURL+"upload").request().
		 post(Entity.entity(text, "application/text")).
		 readEntity(String.class);
	}
	
	public static void nlpFileDownload(String id,String fileName) throws IOException { 
		URL url = new URL(nlprestURL+"downloadbin/"+id);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true); conn.setRequestMethod("GET");
			if (conn.getResponseCode() == 200) {
				InputStream is = conn.getInputStream();
				Files.copy(is, Paths.get(fileName),StandardCopyOption.REPLACE_EXISTING);
			}
			else throw new IOException("Error downloading file");
	}
	
	 private static String getRes(Response res) throws IOException { 
		 if (res.getStatus()!=200)
			 throw new IOException("Error in nlprest processing");
		 return res.readEntity(String.class);
	}
	 
	public static String nlpProcess(String toolname,String id) throws IOException, InterruptedException { 
		Client client = ClientBuilder.newClient();
		String taskid=getRes(client.target(nlprestURL+"startTask/"+toolname+"/"+id).request().get());
		String status="";
		JSONObject jsonres=new JSONObject();
		
		while (!status.equals("DONE")) { 
			String res=getRes(client.target(nlprestURL+"getStatus/"+taskid).request().get());
			jsonres=new JSONObject(res);
			status=jsonres.getString("status");
				if (status.equals("ERROR")) throw new IOException("Error in processing");
				Thread.sleep(500);
		 }
		
		 return jsonres.getString("value");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		 String id=nlpFileUpload("C:\\Users\\wposlednicka\\Documents\\testTager.txt");
		 id=nlpProcess("wcrft2",id);
//		 id=nlpProcess("wsd2",id);
		 nlpFileDownload(id,"C:\\Users\\wposlednicka\\Documents\\test_nlp.xml");
	 }
		
}
