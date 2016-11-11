package corejava.objects;

public class Calculator {
	public String name=null;
	int x = 55, y = 33;

	public int add() {
		return x + y;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		Calculator obj1 = new Calculator();
		System.out.println(obj.add());
		System.out.println(obj.sub(44, 33));
		obj.name="gurman";
		obj1.name="deep singh";
		System.out.println(obj1.sub(224, 33));
		System.out.println(obj.name);
		System.out.println(obj1.name);
	}

}
