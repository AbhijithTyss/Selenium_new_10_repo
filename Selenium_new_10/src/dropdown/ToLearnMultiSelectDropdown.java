package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/abhis/OneDrive/Desktop/MultiSelct.html");
		
		WebElement cars = driver.findElement(By.id("cars"));
		
		Select carSelect=new Select(cars);
		
		carSelect.selectByIndex(0);
		carSelect.selectByIndex(1);
		carSelect.selectByIndex(2);
		
		System.out.println(carSelect.getFirstSelectedOption().getText());// to capture first selected option
		
		List<WebElement> allSelectedOptions = carSelect.getAllSelectedOptions();// to capture all selected options
		System.out.println(allSelectedOptions.size());
		
		for(WebElement ele:allSelectedOptions) {
			System.out.println(ele.getText());
		}
		
		System.out.println(carSelect.isMultiple());
		
		
		
		
		
	}
}	
