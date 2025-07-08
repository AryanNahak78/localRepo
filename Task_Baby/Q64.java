package Task_Baby;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q64 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@*='w-full h-96']")));
		WebElement frame = driver.findElement(By.xpath("//*[@*='w-full h-96']"));		
		driver.switchTo().frame(frame);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@*='frame-root']//input)[1]")));
		driver.findElement(By.xpath("(//*[@*='frame-root']//input)[1]")).sendKeys("hello");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("BYEBYEBYE");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("submitButton")));
		driver.findElement(By.id("submitButton")).click();
	}
}
