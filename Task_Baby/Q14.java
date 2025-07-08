package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		driver.findElement(By.cssSelector("input[name=\"firstname\"]")).sendKeys("Aryan");
		driver.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("Nahak");
		driver.findElement(By.cssSelector("input[aria-label=\"Mobile number or email address\"]")).sendKeys("8249229954");
		driver.findElement(By.cssSelector("input[data-type=\"password\"]")).sendKeys("HELLO");
		driver.findElement(By.cssSelector("input[value=\"2\"]")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
