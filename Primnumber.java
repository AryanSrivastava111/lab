package ARYANJAVA;
import java.util.*;

public class Primnumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter your number ");
        int num=sc.nextInt();
       
        Prime(num);
	}
	  static void Prime(int n) {

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	               System.out.println("the number is not prime");
	            }
	            
	            
	            else {
	            	 System.out.println("the prime is that number"); 
	            }
	        }
	       
	}

}
