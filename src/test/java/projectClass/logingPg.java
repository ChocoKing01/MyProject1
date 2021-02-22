package projectClass;

//import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;

import cucumber.api.java.*;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class logingPg  {
	
	
WebDriver driver = null;
	
	@Before
	public void DoIt()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\MyProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	System.out.println("browser setuped");
	}
	
	
	@Given("^Navigate to the webpage$")
	public void navigate_to_the_webpage() throws Throwable 
	{

		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(3000);
		System.out.println("Successfully navigated to the site");
	}
	
	
	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String UserName, String Password) throws Throwable 
	{

		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("UserName");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Password");
		Thread.sleep(1000);
		
		System.out.println("Values Entered");
	}
	
	@When("^Click the submit button$")
	public void click_the_submit_button() throws Throwable 
	{
	       driver.findElement(By.xpath("//input[@name='submit']")).click();
	       
	   //	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	       
	       System.out.println("login clicked");
	   	
	   	
	}
	
	@AfterMethod
	public void shot(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{

        Utility.captureScreenshot(driver,result.getName());

		}
	}
	
	@SuppressWarnings("deprecation")
	@Test
	@Then("^reaches the success message for login$")
	public void reaches_the_success_message_for_login() throws Throwable {
			 
			WebElement passPage = driver.findElement(By.xpath("//div[@class='footer']"));
			String ExpectedText = "© 2005, Mercury Interactive (v. 011003-1.01-058)";
			Assert.assertEquals(ExpectedText, passPage.getText());	
		System.out.println("Test_passed");
		
	}

}
