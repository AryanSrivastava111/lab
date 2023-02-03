package lab;

import java.util.Scanner;

public class Avaragenumber {

	
	//main method
	
	public static void main(String[]args) {
		
		//take the input from the scanner
		Scanner input=new Scanner(System.in);
		//enter the first num1
		System.out.println("enter the num 1");
		int num1=input.nextInt();
		//take input num 2
		System.out.println("enter the num 2");
		int num2=input.nextInt();
		//take input num 3
				System.out.println("enter the num 3");
			int	num3=input.nextInt();
				//take input num 4
				System.out.println("enter the num 4");
				 int num4=input.nextInt();
				//take input num 5
				System.out.println("enter the num 5");
				int num5=input.nextInt();
				//avarage
				int avg=(num1+num2+num3+num4+num5)/4;
				//print avg
				System.out.print("the avg is ="+avg);
	}
}
