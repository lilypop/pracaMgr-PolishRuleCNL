package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author wposlednicka
 *
 */
public class Line {

	private List<String> words;
	private String value;
	
	public Line(String line){
		this.value = line;
		generateWords(line);
	}

	private void generateWords(String line) {
		words = new ArrayList<String>();
		String[] splited = line.split("\\s+");

		for (String string : splited) {
			words.add(string);
		}
		
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<String> getWords() {
		return words;
	}

	public void setWords(List<String> words) {
		this.words = words;
	}

	@Override
	public String toString() {
		return "Line [words=" + words + "]";
	}
	
	
	
}
