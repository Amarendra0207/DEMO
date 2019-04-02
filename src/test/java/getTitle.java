import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class getTitle 
{
	
    
	public void getTitle1()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//300830//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Rediff.com");
		
		driver.getTitle();
		
	}

}
