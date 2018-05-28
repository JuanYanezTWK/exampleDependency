package business;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//Se declara un objeto Lista del tipo IMyData, todo lo que este dentro debe cumplir solo con la interfaz, cada clase y objeto que implemente
		//esta interfaz se puede ingresar en esta lista sin importar que sean distintos objetos y distintos tipos de datos		
		
		java.util.List<IMyData> lstObjects = new ArrayList<IMyData>();
		
		Product p = new Product();
		p.setCode("myCode");;
		p.setName("Martillo");
		lstObjects.add(p);
		
		Customer c = new Customer();
		c.setName("Don pepe");
		c.setRut("1-9");
		lstObjects.add(c);
		
		Employee e = new Employee();
		e.setName("Juanito Perez");
		e.setRut("1-7");
		lstObjects.add(e);
		
		Car car = new Car();
		
		car.setCodigo("MyCodeCar");
		car.setName("Ford");
		lstObjects.add(car);

		
		//di = car;
		//System.out.println(di.getName());
		
		//di = p;
		//System.out.println(di.getName());
		
		//di = c;
		//System.out.println(di.getName());
		
		//di = e;
		//System.out.println(di.getName());
		
		for(IMyData cur : lstObjects) {
			System.out.println(cur.getName());
			
		}
	}

}
