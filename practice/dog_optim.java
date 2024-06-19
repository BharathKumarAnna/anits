package practice;
import java.util.*;

class dog_optim {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double data = Math.sqrt(n);
        int k = (int) data;
        System.out.println("count :"+k);
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + (i * i));
        }
        sc.close();
    }
}
