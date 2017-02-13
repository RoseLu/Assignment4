
public class Car {
	
	private GasTank gastank;
	private String brand;
	private int mile;
	private int mpg;
	public Car(String brand){
		this.brand=brand;
		this.mile=0;
		this.gastank=new GasTank();
		this.mpg=5;
	}
	public String getBrand(){
		return brand;
	}
	//I would't create setter for this, besides this assignment required me to do this.   
	public void setBrand(String brand){
		this.brand=brand;
	}
	public int getMile(){
		return mile;
	}
	public void setMile(int mile){
		this.mile=mile;
		
	}
	public void addGas(double gas){
		this.gastank.addGas(gas);
	}
	public void drive(int mile){
		this.mile+=mile;
		double gas = mile/(double)mpg;
		this.gastank.useGas(gas);
	}
	public int getMpg(){
		return mpg;
	}
	public void setMpg(int mpg){
		this.mpg=mpg;
	}
	public double getGasLevel(){
		return this.gastank.getGasLevel();
	}

}
