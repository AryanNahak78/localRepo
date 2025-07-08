package Task_Baby;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q66 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//iframe[@*='w-full h-96'])[1]")));
		WebElement signUpFrame = driver.findElement(By.xpath("(//iframe[@*='w-full h-96'])[1]"));
		driver.switchTo().frame(signUpFrame);
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().parentFrame();
		
		WebElement logInFrame = driver.findElement(By.xpath("(//iframe[@*='w-full h-96'])[2]"));
		driver.switchTo().frame(logInFrame);
		driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
		driver.findElement(By.id("submitButton")).click();
	}

}
