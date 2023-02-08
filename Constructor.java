package ARYANJAVA;

public class Constructor {
	
	String a;
	String S;
	Constructor(){
		System.out.println("welcome to default constructor");
	}
	Constructor(String e,String w){
		a=e;
		S=w;
		System.out.println(a+" "+S);
	}
	void relation() {
		System.out.print(S+""+S+"are brother");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Constructor cd=new Constructor();
         Constructor cd1=new Constructor("name","aryan");
         Constructor cd2=new Constructor("name2","abhi");
         cd1.relation();
         
	}

}
