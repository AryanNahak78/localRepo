package Task_Baby;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q73 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/table/tablePagination");
	while (true) {
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@*='bg-white border-b  hover:bg-orange-100']//th")));
       List<WebElement> page1names = driver.findElements(By.xpath("//*[@*='bg-white border-b  hover:bg-orange-100']//th"));

       wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@*,'cursor-pointer bg-orange-')]")));
       List<WebElement> pages=driver.findElements(By.xpath("//*[contains(@*,'cursor-pointer bg-orange-')]"));
      
       Actions action=new Actions(driver);
       for (WebElement names : page1names) {
try {
	if (names.getText().contains("Samsung TV")) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//*[@*='bg-white border-b  hover:bg-orange-100'])[3]//td)[3]")));
		WebElement Samsung_Discount = driver.findElement(By.xpath("((//*[@*='bg-white border-b  hover:bg-orange-100'])[3]//td)[3]"));
		System.out.println("Discount of Samsung TV is : "+ Samsung_Discount);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//*[@*='bg-white border-b  hover:bg-orange-100'])[3]//td)[4]")));
		WebElement Samsung_Price = driver.findElement(By.xpath("((//*[@*='bg-white border-b  hover:bg-orange-100'])[3]//td)[4]"));
		System.out.println("Price of Samsung TV is :"+ Samsung_Price);
		break;
	}
	else {
		for (int i = 1; i <pages.size(); i++) {
			Thread.sleep(3000);
			action.moveToElement(pages.get(i)).click().perform();
		}
	}
} catch (Exception e) {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//*[@*='bg-white border-b  hover:bg-orange-100'])[3]//td)[3]")));
	WebElement Samsung_Discount = driver.findElement(By.xpath("((//*[@*='bg-white border-b  hover:bg-orange-100'])[3]//td)[3]"));
	System.out.println("Discount of Samsung TV is : "+ Samsung_Discount.getText());
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//*[@*='bg-white border-b  hover:bg-orange-100'])[3]//td)[4]")));
	WebElement Samsung_Price = driver.findElement(By.xpath("((//*[@*='bg-white border-b  hover:bg-orange-100'])[3]//td)[4]"));
	System.out.println("Price of Samsung TV is : "+ Samsung_Price.getText());
	break;
}
       }
	 break;
	 }
	}
	}

