package corejava.interfaces;
 
public class Calculator implements Arthematic,Trignometery {
	
	public static void main(String[] args) {
		double x=33,y=44;
	Calculator obj=new Calculator();
	System.out.println(obj.add(2, 3));
	System.out.println(obj.div(x, y));
	System.out.println(obj.sine(77));
	System.out.println(obj.tan(30));

	}
	
	public double sine(double x) {
		// TODO Auto-generated method stub
		return Math.sin(x);
	}
	public double tan(double x){
		return Math.tan(x);
	}
	@Override
	public double add(double x,double y){
		
		return x+y;
	}
	@Override
	public double sub(double x,double y){
		return x-y;
	}
	
	public double mul(double x,double y){
		return x*y;
	}
	public double div(double x,double y){
		return x/y;
	}


}
