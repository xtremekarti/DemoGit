package test.sample.selenium1;

public class TestCaseFailedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "Your testcase got failed due to some reason";
	}

}
