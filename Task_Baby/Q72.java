package Task_Baby;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q72 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable");

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//tr[@*='bg-white border-b  hover:bg-orange-100'])[1]//td")));
		List<WebElement> leviShirt = driver.findElements(By.xpath("(//tr[@*='bg-white border-b  hover:bg-orange-100'])[1]//td"));
		
	for (WebElement ele : leviShirt) {
		if (ele.getText().contains("%")) {

		System.out.println("Levi Shirt Discount % : "+ele.getText());}
	}
	}
}
