package corejava.argument;

public class Mainclass {
	int x=10,y=20;
	
	public void message(){
		Secondclass obj1=new Secondclass(new Mainclass());
		System.out.println(obj1.add());
		
}																			  
public static void main(String[] args) {
Mainclass obj=new Mainclass();
   obj.message();
}	
}



                       
                       
                       
                        
                 							     