package Task_Baby;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Q57 {

	public static void main(String[] args) throws InterruptedException  {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		Actions action=new Actions(driver);
		WebElement MenLink = driver.findElement(By.xpath("(//*[@data-group='men'])[1]"));
		Thread.sleep(1000);
		action.moveToElement(MenLink).perform();
		WebElement sweaters = driver.findElement(By.xpath("//*[text()='Sweaters']"));
		Thread.sleep(1000);
		action.moveToElement(sweaters).click().perform();
		driver.findElement(By.xpath("//*[@class='brand-more']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[@data-item='l'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='Levis']/../div")).click();
		Thread.sleep(500);
		action.moveToElement(driver.findElement(By.xpath("//*[contains(@*,'close sprites-remove')]"))).click().perform();
		Thread.sleep(500);
		action.moveToElement(driver.findElement(By.xpath("//*[text()='30% and above']//div"))).click().perform();
		Thread.sleep(500);
		driver.findElement(By.id("30184652")).click();
		System.out.println("38 "+driver.getTitle());
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handlesTitle : windowHandles) {
			if (driver.switchTo().window(handlesTitle).getTitle().contains("Levis")) {
				Thread.sleep(200);
				System.out.println("Navigated to new product page");
				break;
			}
		}
		System.out.println("47 "+driver.getTitle());
		System.out.println("----------------------------------------------------");
		System.out.println("Product Name : "+driver.findElement(By.xpath("//*[@class='pdp-title']")).getText());
		System.out.println("Product Seller : "+driver.findElement(By.xpath("//*[@class='supplier-productSellerName']")).getText());
		System.out.println("Best price : "+driver.findElement(By.xpath("//*[@class='pdp-price']")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class=\"size-buttons-buttonContainer\"])[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@*='Enter pincode']")).sendKeys("751024");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[contains(@class,'pdp-add-to-bag')]")).click();
		Thread.sleep(500);
		action.moveToElement(driver.findElement(By.xpath("//*[text()='Bag']/.."))).click().perform();
	
	}
}
