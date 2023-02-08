package ARYANJAVA;

import java.util.Scanner;

public class Additionmethod {
public static void add(int a,int b) {
	int s=a+b;
	System.out.println("here is the sum = "+s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int c=sc.nextInt();
int d=sc.nextInt();
		add(c,d);
	}

}
