package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg");
		
		WebElement hiddenEle = driver.findElement(By.id("custom_gender"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='selenium....'", hiddenEle);
		
		WebElement custom = driver.findElement(By.xpath("//label[text()='Custom']"));
		
		js.executeScript("arguments[0].click()", custom);
	}
}
