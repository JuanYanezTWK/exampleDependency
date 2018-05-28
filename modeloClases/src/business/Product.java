package business;

public class Product implements IMyData {

	private String code;
	private String name;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return "Product: " +name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
