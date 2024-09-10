import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//WebElement searchbar=driver.findElement(By.name("q"));
		//searchbar.sendKeys("Automation step by step",Keys.ENTER);
      driver.navigate().to("https://trytestingthis.netlify.app/");
      List<WebElement> options =driver.findElements(By.name("Optionwithcheck[]"));
     for(WebElement element : options) {
    	 System.out.println(element.getText());
     }
      
      
      Thread.sleep(2000);
	}

}
