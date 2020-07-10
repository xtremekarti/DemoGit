package test.sample.selenium1;

public class Xyz{
	public int x;
	private String y;
	protected boolean z;
	int d=10;
	public Xyz() {
		System.out.println("XYZ constructor get called");
	}
	public Xyz(int x, String y, boolean z) {
		this();
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public  void printVariableData() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	public static void main(String args[]) 
	{
		//Xyz obj=new Xyz();
		/*System.out.println(obj.x);
		System.out.println(y);
		System.out.println(z);*/
	}
}