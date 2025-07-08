package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q21 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.instagram.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Aryan_Nahak");
		driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("aryann@12345");
	}

}
