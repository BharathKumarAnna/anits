// Constructor Overloading

package practice;


class Flower{
	String fName;
	int NoOfPetals;
	String Colour;
	boolean skinCare;
	
	public Flower(String fName,int NoOfPetals,String Colour){
		this.fName = fName;
		this.NoOfPetals = NoOfPetals;
		this.Colour = Colour;	
	}
	
	public Flower(String fName,int NoOfPetals,String Colour,boolean skinCare){
		this.fName = fName;
		this.NoOfPetals = NoOfPetals;
		this.Colour = Colour;
		this.skinCare = skinCare;
		
	}
	public void display() {
		System.out.println("Flower Name : "+this.fName);
		System.out.println("No of petals : "+this.NoOfPetals);
		System.out.println("Flower Colour : "+this.Colour);
		if(skinCare==true) {
			System.out.println("Used for SkinCare.");
		}
	}
	
}


class UserLogic {
	public static void main (String[] args) {
	Flower f1 =new Flower (" Kaner",5,"pink");
	f1. display();
	Flower f2 = new Flower("Rose" ,100 ,"red");
	f2.display();
	Flower f3= new Flower ("Sahasradal Kamal", 1000, "red violet",true);
	f3. display (); 
	}
}


