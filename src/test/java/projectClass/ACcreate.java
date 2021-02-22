package projectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.*;
import cucumber.api.java.en.*;

public class ACcreate {
	
	WebDriver driver = null;
	
	@Before
	public void DoIt()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\MyProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	System.out.println("browser setuped");
	}
	
	@Given("^Navigate to the Webpage$")
	public void navigate_to_the_Webpage() throws Throwable 
	{
		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(3000);
		System.out.println("Successfully navigated to the site");
	}
	
	@Given("^Click to go the registration tab$")
	public void click_to_go_the_registration_tab() throws Throwable 
	{
		driver.findElement(By.xpath("//a[@href=\"register.php\"]")).click();
		//driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		System.out.println("Successfully tag to the site");
	}

	@When("^Enter the values in required fields$")
	public void enter_the_values_in_required_fields() throws Throwable 
	{

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Spider");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Man");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("91898282");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("spider@yahoo.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Marvel,Standley street");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("los angels");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("1273938");
		Thread.sleep(1000);
			
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		dropdown.selectByVisibleText("AMERICAN SAMOA");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Spidy01");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("man@123");
		Thread.sleep(1000);
		

		driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("man@123");
		Thread.sleep(1000);
		
		
		System.out.println("Values are entered");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();;
	}
	
	@Then("^reach the success page for account creation$")
	public void reach_the_success_page_for_account_creation() throws Throwable 
	{
		
	}
}
