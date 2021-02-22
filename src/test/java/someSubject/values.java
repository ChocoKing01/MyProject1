package someSubject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class values  {
  
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\eclipse-workspace\\MyProject\\src\\main\\resources\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("browser setuped");
	
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
    driver.quit();
}
	
}