package practice;



import java.util.*;

public class LeapYear {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int year = sc.nextInt();
		if((year%4==0 && year%100!=0) || (year%400==0)){
			System.out.println("Leap Year.");
		}
		else {
			System.out.println("Not Leap Year.");
		}
	}
	

}
