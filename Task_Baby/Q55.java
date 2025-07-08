package Task_Baby;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q55 {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("departDate1")));
		driver.findElement(By.id("departDate1")).click();
		
		while (true) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='months-text'])[2]")));
			String monthYear = driver.findElement(By.xpath("(//*[@class='months-text'])[2]")).getText();
			String month = (monthYear.split(" "))[0];
			String year = (monthYear.split(" "))[1];
			
			if (month.equals("December") && year.equals("2025")) {

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@date-data='2025-12-20']")));
				driver.findElement(By.xpath("//*[@date-data='2025-12-20']")).click();
				break;
			}
			else {

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='right']")));
				driver.findElement(By.xpath("//*[@class='right']")).click();
			}
		}
	}
}
