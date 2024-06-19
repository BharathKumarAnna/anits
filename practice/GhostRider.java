// Encapsulation
package practice;

class Bike{
	String BrandName;
	int milage;
	private int TopSpeed;
	
	public int getTopSpeed() {
		return this.TopSpeed;
	}
	
	public void setTopSpeed(int TopSpeed) {
		if(TopSpeed>=0 && TopSpeed<220) {
			this.TopSpeed = TopSpeed;
		}
		else {
			this.TopSpeed = 220;
		}
		
	}
	
	public Bike(String BrandName,int milage,int TopSpeed) {
		this.BrandName = BrandName;
		this.milage = milage;
		if(TopSpeed>=0 && TopSpeed<220) {
			this.TopSpeed = TopSpeed;
		}
		else {
			this.TopSpeed = 220;
		}
		
	}
	public void ride() {
		System.out.println("Riding to Ladak with a top speed of : "+this.TopSpeed);
	}
	
}

public class GhostRider {
	public static void main(String[] args) {
		Bike bike = new Bike("Yamaha R15",40,157);
		bike.ride();
		bike.setTopSpeed(250);
		bike.ride();
	}

}
