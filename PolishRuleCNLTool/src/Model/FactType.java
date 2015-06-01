package Model;

import java.util.ArrayList;
import java.util.List;

public class FactType extends Concept {

	public List<FactTypeRole> orderedFactTypeRoles = new ArrayList<FactTypeRole>();

    public String name = "FactType";

	public List<FactTypeRole> getOrderedFactTypeRoles() {
		return orderedFactTypeRoles;
	}

	public void setOrderedFactTypeRoles(List<FactTypeRole> orderedFactTypeRoles) {
		this.orderedFactTypeRoles = orderedFactTypeRoles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
