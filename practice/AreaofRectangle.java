
package practice;

class Rectangle_ar {
	double length;
	double breadth;
	

	public void areaofRectangle() {
		System.out.println("Area of the rectangle is :"+this.length*this.breadth);
		
	}

}
class AreaofRectangle{
	public static void main(String[] args) {
		Rectangle_ar r1 = new Rectangle_ar();
		r1.length = 6.4;
		r1.breadth = 2.4;
		r1.areaofRectangle();
		Rectangle_ar r2 = new Rectangle_ar();
		r2.length = 12.8;
		r2.breadth = 5.6;
		r2.areaofRectangle();
	}	
}








/*

package practice;

class Rectangle_ar {
	double length;
	double breadth;
//	constructor
	public Rectangle_ar(double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}
	public void areaofRectangle() {
		System.out.println("Area of the rectangle is :"+this.length*this.breadth);
		
	}

}
class AreaofRectangle{
	public static void main(String[] args) {
		Rectangle_ar r1 = new Rectangle_ar(20.4,9.8);
		r1.areaofRectangle();
		Rectangle_ar r2 = new Rectangle_ar(11.6,4.9);
		r2.areaofRectangle();
	}	
}
*/

