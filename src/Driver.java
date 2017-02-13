
public class Driver {
	
	private Car car;
	public Driver(Car car){
		this.car=car;
	}
	
	public void addGas(double a){
		car.addGas(a);
	}
	public void drive(int mile){
		car.drive(mile);
		
	}
	

	public static void main(String[] args) {
		

	}

}
