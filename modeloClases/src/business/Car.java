package business;

public class Car implements IMyData{

	private String codigo;
	private String name;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getName() {
		return "CarName: " +name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
