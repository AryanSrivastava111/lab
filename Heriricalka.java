package lab;
class Teacher{ 
    String destination="Lucknow";
    String collage="Lit";
    void work(){
        System.out.println("teacher are here to teach");
    }
  
    }
    class ItTeacher extends Teacher{
     /*   String destination=Lucknow;
    String collage=Lit;
    void work(){
        System.out.println("teacher are here to teach");
    }*/
    void it(){
    System.out.println(destination+" "+collage);
    }
    }
    class  Mathteacher extends Teacher{
        void math(){
         System.out.println("this is  math class"+destination+" "+collage);
    }
}
class Softskill extends Teacher{
    void skill(){
        System.out.println("this is soft skills teacher"+destination+" "+collage);
    }
}
public class Heriricalka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ItTeacher it=new ItTeacher();
		     Mathteacher mt=new Mathteacher();
		     Softskill ss=new Softskill();
		     it.work();
		     it.it();
		     mt.work();
		     mt.math();
		     ss.work();
		     ss.skill();
	}

}
