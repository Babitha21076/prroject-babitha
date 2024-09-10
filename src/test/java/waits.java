import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver= new ChromeDriver();
 //implicit wait
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
 driver.get("https://www.google.com/");
 driver.manage().window().maximize();
 driver.findElement(By.name("q")).sendKeys("Automation step by step" + Keys.ENTER);
 
	}

}
