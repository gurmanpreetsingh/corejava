package corejava.inheritance;

 class Input {
	int i=0,j=0;
	public void input(int i,int j){
		this.i=i;
		this.j=j;
	}
}
class Main extends Output{
	public int add(){
		return i+j;
	}
	public static void main(String[] args) {
		Main obj =new Main();
	obj.input(7, 6);
	obj.display(obj.add());
		System.out.println(obj.add());
		

	}

}
