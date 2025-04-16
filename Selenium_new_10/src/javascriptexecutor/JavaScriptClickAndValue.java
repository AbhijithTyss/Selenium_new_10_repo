package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClickAndValue{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement register = driver.findElement(By.linkText("Register"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", register);
		
		WebElement firstName = driver.findElement(By.id("FirstName"));
		js.executeScript("arguments[0].value='Abhijith'", firstName);
		
		Thread.sleep(2000);
		js.executeScript("history.go()");// refresh without using refresh()
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// scroll till the bottom	
	}
}
