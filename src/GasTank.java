
public class GasTank {
	
	private double amount;
	public GasTank(){
		this.amount=0;
	}
		
	
	public void addGas(double a){
		amount+=a;
	}
	
	public void useGas(double b){
		amount-=b;
	}
	
	public double getGasLevel(){
		return amount;
	}


}
