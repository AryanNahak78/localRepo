package Task_Baby;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q62 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions action=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.airasia.com/en/gb");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@*,'askbo-blurb')]")));
		driver.findElement(By.xpath("//*[contains(@*,'askbo-blurb')]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("airasia-sso-modal-wrapper-close-button")));
		driver.findElement(By.id("airasia-sso-modal-wrapper-close-button")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ada-chat-frame']")));
		WebElement boChat = driver.findElement(By.xpath("//*[@id='ada-chat-frame']"));
		driver.switchTo().frame(boChat);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@*='Message…']")));
		driver.findElement(By.xpath("//*[@*='Message…']")).sendKeys("Hello");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@*='SendButton']")));
		action.moveToElement(driver.findElement(By.xpath("//*[@*='SendButton']"))).click().perform();

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@*='AVAChatbot__AVACloseBtn-sc-wr5nvu-5 gNIWDS']")));
		WebElement closeButton = driver.findElement(By.xpath("//*[@*='AVAChatbot__AVACloseBtn-sc-wr5nvu-5 gNIWDS']"));
		js.executeScript("argument[0].click()", closeButton);
	}

}
