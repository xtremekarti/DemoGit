package test.sample.selenium1;

public class TestMyException {

	public static void main(String[] args) {
		int x=10;
		//new TestMyException().printNumber(x);
		try {
			testEvenNumber(11);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
	}
	
	public static  void testEvenNumber(int x) throws Throwable{
		testEvenNumber(x);
		if(x%2==1)
			throw new TestCaseFailedException();
	}
	
	public void printNumber(int x) {
		if(x==0)
			return;
		printNumber(x-1);
		System.out.println(x);
	}

}
