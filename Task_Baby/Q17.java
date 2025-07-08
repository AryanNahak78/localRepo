package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q17 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.instagram.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("span[style=\"line-height: 18px;\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[aria-label=\"Mobile Number or Email\"]")).sendKeys("8249229954");
		driver.findElement(By.cssSelector("input[aria-label=\"Password\"]")).sendKeys("Hello@123");
		driver.findElement(By.cssSelector("input[aria-label=\"Full Name\"]")).sendKeys("Aryan Nahak");
		driver.findElement(By.cssSelector("input[aria-label=\"Username\"]")).sendKeys("MrNahak78");
	}

}
