package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		//search
		driver.findElement( By.xpath("//*[@placeholder='Search for Products, Brands and More']")).sendKeys("Samsung s24 ultra");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='samsung s24 ultra']")));
		driver.findElement(By.xpath("//*[text()='samsung s24 ultra']")).click();
	
		//login here can be done manually because it will be asking for OTP which we can't automate
		
		
		//select product
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Samsung Galaxy S24 Ultra 5G (Titanium Black, 256 GB)'])[1]")));
		driver.findElement(By.xpath("(//*[text()='Samsung Galaxy S24 Ultra 5G (Titanium Black, 256 GB)'])[1]")).click();
		
		//add to cart
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (driver.switchTo().window(string).getTitle().contains("Samsung Galaxy S24 Ultra 5G ( 256 GB Storage, 12 GB RAM ) Online at Best Price On Flipkart.com")) {
				break;
			}
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Add to cart']")));
		driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
		
		//to see if the product is added
		Thread.sleep(2000);
		
		//quitting the session
		driver.quit();
	}
}
