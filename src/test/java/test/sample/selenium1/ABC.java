package test.sample.selenium1;

public class ABC extends Xyz{
	public ABC() {
		super();
		// TODO Auto-generated constructor stub
	}

	int h=10;
	public ABC(int x, String y, boolean z) {
		//this();
		super(x,y,z);
	}
	public void ABC1() {
		//super();
		System.out.println("ABC constructor get called");
	}
	@Override
	public  void printVariableData() {
		System.out.println(x);
		//System.out.println(y);
		System.out.println(z);
	}
	
	public void print() {
		
	}
}