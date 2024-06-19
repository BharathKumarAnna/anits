package practice;

public class sumOfDigits {
	public static int digitsum(int n) {
		if(n!=0) {
			//sum of individual digits
			return (n%10)+digitsum(n/10);
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(digitsum(123));
		
	}

}
