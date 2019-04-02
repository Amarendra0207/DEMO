import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hi ");
		System.setProperty("webdriver.chrome.driver", "C://Users//300830//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.Facebook.com");
		//driver.manage().window().maximize();
		Select Month = new Select (driver.findElement(By.id("month")));
	List<WebElement>  month =	Month.getOptions();
	for (WebElement  mo :month)
	{
		
		System.out.println(mo.getText());
	}
	Thread.sleep(3000);	
		
	}

}
