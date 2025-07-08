package Task_Baby;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q67 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@*='w-full h-96']")));
		WebElement fullFrame = driver.findElement(By.xpath("//iframe[@*='w-full h-96']"));
		driver.switchTo().frame(fullFrame);
		
		WebElement logInFrame = driver.findElement(By.xpath("(//iframe[@srcdoc])[1]"));
		driver.switchTo().frame(logInFrame);
		
		WebElement emailSpace = driver.findElement(By.xpath("(//iframe[@srcdoc])[1]"));
		driver.switchTo().frame(emailSpace);
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		
		driver.switchTo().parentFrame();
	
		WebElement passwordSpace = driver.findElement(By.xpath("(//iframe[@srcdoc])[2]"));
		driver.switchTo().frame(passwordSpace);
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
	
		driver.switchTo().parentFrame();
		
		WebElement confPassSpace = driver.findElement(By.xpath("(//iframe[@srcdoc])[3]"));
		driver.switchTo().frame(confPassSpace);
		driver.findElement(By.id("confirm")).sendKeys("Admin@1234");
		
		driver.switchTo().parentFrame();
		
		WebElement submitSpace = driver.findElement(By.xpath("(//iframe[@srcdoc])[4]"));
		driver.switchTo().frame(submitSpace);
		driver.findElement(By.id("submitButton")).click();
		System.out.println("DONE");
	}
}
