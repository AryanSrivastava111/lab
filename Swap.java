package lab;

import java.util.Scanner;

public class Swap {
	
	
	  public void swap1(int a,int b) {
		  int temp=a;
		  a=b;
		  b=temp;
		  System.out.print(" "+a+" "+b);
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		int s2=0;
		Scanner sc=new Scanner(System.in);
		//taking first input
		System.out.println("enter first num");
		
		 s=sc.nextInt();
		 //taking seconf inpurt
		 System.out.println("enter second num");
		 s2=sc.nextInt();//swap method
		
        Swap sp=new Swap();
        sp.swap1(s, s2);
	}

}
