package Task_Baby;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q71 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Apple iPhone']/..//td)[4]")));
		WebElement iphonePrice = driver.findElement(By.xpath("(//*[text()='Apple iPhone']/..//td)[4]"));

		System.out.println("Price of iphone : "+iphonePrice.getText());
	}

}
