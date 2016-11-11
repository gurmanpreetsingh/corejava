package corejava.innerclass;

public class Outerclass {
   int x=9 ,y=10;
   public void message(){
	   Innerclass obj =new Innerclass(); 
	   System.out.println(obj.add());
	   
   }

  public static void main(String arg[]){
	  Outerclass obj =new Outerclass();
	  obj.message();
  }
   class Innerclass{
	   public int add(){
		   return x+y;
	   }
   }
}