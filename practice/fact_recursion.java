package practice;

public class fact_recursion {
	public static int fact(int n) {
		if(n>0) {
		return n*fact(n-1);
		}
		return 1;
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

}
