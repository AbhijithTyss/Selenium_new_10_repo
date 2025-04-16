package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleALertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.switchTo().alert().accept();//NoAlertPresentException
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.findElement(By.id("newsletter-subscribe-button")).click();//UnHandledAlertException
		
		
//		Thread.sleep(2000);
//		Alert popup = driver.switchTo().alert();
//		String msg = popup.getText();
//		System.out.println(msg);
////		popup.accept();
//		popup.dismiss();
	}
}
