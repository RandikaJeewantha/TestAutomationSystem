package runners;

public class CucumberCliRunner {
	
	public static void main(String[] args) throws Throwable {
		
		String[] arguments = {
				"--glue",
	            "classpath:scenarios",
	            "classpath:Features",
	            "--plugin", 
	            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		};
		
		io.cucumber.core.cli.Main.main(arguments);
	}

}
