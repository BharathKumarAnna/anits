// Inheritance
package practice;

class Movie{
	double budget;
	String tom; //theme of movie
	String dn; //Director of movie
	
	
	public Movie(double budget,String tom,String dn) {
		this.budget = budget;
		this.tom = tom;
		this.dn = dn;
	}
	
}


class Pushpa extends Movie{
	String actorN;
	String actressN;
	double collection;
	
	
	public Pushpa(double budget,String tom,String dn,String actorN,String actressN,double collection) {
		super(budget,tom,dn);
		this.actorN = actorN;
		this.actressN = actressN;
		this.collection = collection;
	}
	
	public void entertainment() {
		System.out.println("Pushpa thaggedhey lee...!");
		
	}
}


public class Theater {
	public static void main(String[] args) {
		Pushpa p = new Pushpa(200.0,"Action","sukumar","AA","samantha",700.0);
		p.entertainment();
	}

}
