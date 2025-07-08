package Task_Baby;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q65 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@*='w-full h-96']")));
		WebElement fullFrame = driver.findElement(By.xpath("//*[@*='w-full h-96']"));
		driver.switchTo().frame(fullFrame);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[contains(@*,'<!DOCTYPE html><html>')]")));
		WebElement childFrame = driver.findElement(By.xpath("//iframe[contains(@*,'<!DOCTYPE html><html>')]"));
		driver.switchTo().frame(childFrame);
		
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		driver.findElement(By.id("submitButton")).click();
	}

}
