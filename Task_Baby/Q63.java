package Task_Baby;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q63 {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.airindia.com/");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@*='onetrust-accept-btn-handler']")));
		driver.findElement(By.xpath("//*[@*='onetrust-accept-btn-handler']")).click();
		
		driver.findElement(By.xpath("//*[@*='Air India Chat bot icon']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@*='Type your question here...']")));
		driver.findElement(By.xpath("//*[@*='Type your question here...']")).sendKeys("Hello");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@*='chatbot-send-btn-container chat-btn']")));
		driver.findElement(By.xpath("//*[@*='chatbot-send-btn-container chat-btn']")).click();
		
		driver.findElement(By.xpath("//*[@*='Type your question here...']")).sendKeys("No,Thanks");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@*='chatbot-send-btn-container chat-btn']")));
		driver.findElement(By.xpath("//*[@*='chatbot-send-btn-container chat-btn']")).click();

		WebElement closeButton = driver.findElement(By.xpath("//*[@*='close-icon']"));
		js.executeScript("arguments[0].click()",closeButton );

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=' Exit ']")));
		driver.findElement(By.xpath("//*[text()=' Exit ']")).click();
		
	}

}
