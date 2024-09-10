import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
     /*driver.manage().timeouts().implicitlyWait(null);
	driver.manage().timeouts().scriptTimeout(null);
	driver.manage().timeouts().pageLoadTimeout(null);
		
		driver.get("https://www.google.com/");
		String originalWindow= driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.navigate().to("https://automationstepbystep.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//object originalwindow is used to store the window using string
		
		
		//openong new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		//OPENING TO NEW TAB
		driver.switchTo().newWindow(WindowType.TAB);
		//getting back to originalwindow
		driver.switchTo().window(originalWindow); 
		
		
		
		//driver.get("https://www.selenium.dev/documentation/webdriver/interactions/frames/");
	
		driver.manage().window().getSize().getWidth();
		driver.manage().window().getSize().getHeight();
		Dimension size=driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(800,600));
		Thread.sleep(2000);
		//driver.manage().window().maximize();
*/
		driver.get("https://www.google.com/");
		//screenshots saving in targets folder
		/*File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./image1.png"));
		WebElement element=driver.findElement(By.cssSelector(".lnXdpd"));
		File srcFile1= element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./image2.png"));
		
		Thread.sleep(2000);*/
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement button= driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click()", button);
		js.executeScript("console.log('Hello world..')");
		
		//driver.close();//Closes the tab
		//driver.quit();//closes the complete browser/session
		
		
		
	}

}
