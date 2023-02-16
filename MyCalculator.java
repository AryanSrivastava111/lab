package lab;
import java.util.Scanner;

class AdvanceAirthmetic{
int sum=0;
int divisor_sum(int n) {
    for (int i = n; i >= 1; i--) {
        if (n % i == 0) {
            sum = sum + i;
        }
    }
    return sum;

}
}
public class MyCalculator extends AdvanceAirthmetic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	      System.out.println("enter the number");
	      int s=sc.nextInt();

		AdvanceAirthmetic a=new AdvanceAirthmetic();
		int x =a.divisor_sum( s);
	    System.out.print("divisor_sum = "+x );
	
	}

}
