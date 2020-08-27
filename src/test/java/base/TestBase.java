package base; 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class TestBase {

	public static WebDriver driver;
	public static Properties properties;
	public static String baseURL;
	public static String commonTestUserNameOrEmail;
	public static String commonTestUserPassword;
	
	static SessionId sessionId;

	/* Getting project paths */

	static String projectPath = System.getProperty("user.dir");
	static String propertiesPath = projectPath + "/src/test/resources/Properties";
	static String driversPath = projectPath + "/src/test/resources/Drivers";

	public TestBase() {

		/* Getting configuration properties */

		try {
			properties = new Properties();
			FileInputStream configProperties = new FileInputStream(propertiesPath + "/config.properties");
			properties.load(configProperties);

			baseURL = properties.getProperty("baseURL");
			commonTestUserNameOrEmail = properties.getProperty("commonTestUserNameOrEmail");
			commonTestUserPassword = properties.getProperty("commonTestUserPassword");
		}

		catch(FileNotFoundException e) {
			e.printStackTrace();
		}

		catch(IOException e) {
			e.printStackTrace();
		}
	}

	/* Initialisation step and setting browser configurations */

	public static void initialization() {

		if(sessionId == null) {
			String browserName = properties.getProperty("browser");
			boolean headLessMode = Boolean.parseBoolean(properties.getProperty("headLessMode"));
			long pageLoadTimeOut = Long.parseLong(properties.getProperty("pageLoadTimeOut"));
			long implicitlyWait = Long.parseLong(properties.getProperty("implicitlyWait"));
			long scriptTimeout = Long.parseLong(properties.getProperty("scriptTimeout"));

			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", driversPath + "/chromedriver.exe");
				
				/* Chrome testing mode */
				
				if(headLessMode) {
					
					/* Chrome run on background - No UI*/
					
					ChromeOptions options = new ChromeOptions();
					options.setHeadless(headLessMode);
					driver = new ChromeDriver(options);
				}
				
				else {
					
					/* Chrome run on UI mode - normal */
					
					driver = new ChromeDriver();
				}
				
			}

			else if(browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", driversPath + "/geckodriver.exe");
				
				/* Firefox testing mode */
				
				if(headLessMode) {
					
					/* Firefox run on background - No UI*/
					
					FirefoxOptions options = new FirefoxOptions();
					options.setHeadless(headLessMode);
					driver = new FirefoxDriver(options);
				}
				
				else {
					
					/* Firefox run on UI mode - normal */
					
					driver = new FirefoxDriver();
				}
				
			}

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(pageLoadTimeOut, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(scriptTimeout, TimeUnit.SECONDS);

			driver.get(properties.getProperty("url"));

			sessionId = ((RemoteWebDriver) driver).getSessionId();
		}
	}

	/* Driver exit method */

	public static void tearDown() {
		driver.quit();
		sessionId = null;
	}

}
