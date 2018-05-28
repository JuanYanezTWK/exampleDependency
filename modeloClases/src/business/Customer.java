package business;

public class Customer implements IMyData {

	private String rut;
	private String name;
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getName() {
		return "Customer: " + name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
