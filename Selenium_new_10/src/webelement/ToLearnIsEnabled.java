package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		 WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(loginBtn.isEnabled());// before entering data
		
		driver.findElement(By.name("username")).sendKeys("12345678");
		driver.findElement(By.name("password")).sendKeys("test@1234567");
		
		System.out.println(loginBtn.isEnabled());// after entering data
		
	}
}
