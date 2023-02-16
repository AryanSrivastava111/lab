import java.util.Scanner;

class Arithmatic{ 
    int add(int a,int b){
    return a+b;
    }
}
public class Adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Arithmatic ar=new Arithmatic();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the integer");
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        System.out.println(ar.add(a,b));
	}

}
