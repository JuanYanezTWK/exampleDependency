package business;

public class Customer implements IMyData {

	private String rut;
	private String name;
	private IWebService _ws;
	
	Customer(IWebService iWs){
		_ws = iWs;
		
	}
	
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
	
	public double getAmount() {
		return 100 * _ws.getTax();
		
	}
	
	public String ToString() {
		return this.getName() + " Intereres son: " + getAmount();
		
	}
	
	
}
