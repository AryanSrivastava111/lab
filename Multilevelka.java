package lab;
class A{ 
    void a(){
       System.out.println("this is a class");  
    }
  
    }
    class B extends A{
        void b(){
            System.out.println("this is  b class");
        }
         
    }
    class C extends B{
        void c(){
         System.out.println("this is c class");
    }
}
public class Multilevelka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  C c=new C();
	      c.a();
	      c.b();
	      c.c();
	}

}
