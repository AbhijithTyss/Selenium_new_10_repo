package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Demo Web Shop")) {
			System.out.println("Welcome page is displayed");
		}else {
			System.out.println("Welcome page is not displayed");
		}
	}
}
