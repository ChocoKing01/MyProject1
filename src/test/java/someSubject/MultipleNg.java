package someSubject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class MultipleNg {

	
	WebDriver driver = null;
	//String projectPath = System.getProperty("user.dir");
	
	@Parameters("MyValue")
	@BeforeTest
	public void setup(String browservalue) {
		System.out.println("Browser name is : "+browservalue);
		System.out.println("Thread id : "+Thread.currentThread().getId());
		
		if(browservalue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\MyProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browservalue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\training\\eclipse-workspace\\MyProject\\src\\main\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void Accessing() throws Throwable {
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		System.out.println("Page Opened");
	}
	
	@AfterTest
	public void EndOfTheTest() {
		driver.quit();
		System.out.println("All Test should be done Successfully");
	}
}
