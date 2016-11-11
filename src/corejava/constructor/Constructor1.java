package corejava.constructor;

public class Constructor1 {
	int x,y;
	public int add(){
		return x+y;
	}
	Constructor1(){
		
	}
	Constructor1(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public static void main(String arg[]){
		Constructor1 obj1=new Constructor1(6,9);
	
		
		System.out.println(obj1.add());
	 
	}
}
      