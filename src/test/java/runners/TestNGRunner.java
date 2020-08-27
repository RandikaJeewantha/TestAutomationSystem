package runners;

import org.testng.TestNG;

public class TestNGRunner {

	static TestNG testNG;
	
	public static void main(String[] args) throws Throwable {
		
		testNG = new TestNG();
		testNG.setTestClasses(new Class[] {CucumberRunner.class});
		testNG.run();
	}

}
