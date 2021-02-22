package projectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PgValues {

  WebDriver driver=null;
	@Before
	public void DoIt()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\MyProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	System.out.println("browser setuped");
	}
	
	
	@Given("^Goto the webpage$")
	public void goto_the_webpage() throws Throwable 
	{
		
		System.out.println("Successfully navigated to the site");
	}
	
	@When("^Print the values$")
	public void print_the_values() throws Throwable 
	{
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		

	    Select s = new Select((WebElement) driver.findElements(By.xpath("//select[@name='country']")));
	    
	    System.out.println("total values"+((List<WebElement>) s).size());
	    
	    List <WebElement> optionsVal = s.getOptions();
	    
	    int i=1;
	    
	    for(WebElement e:optionsVal)
	    {
	    	System.out.println(i+"."+e.getText());
	    	i++;
	    }
	}
	
	@Then("^Exit to the page$")
	public void exit_to_the_page() throws Throwable 
	{
	
		driver.quit();
	}
}

