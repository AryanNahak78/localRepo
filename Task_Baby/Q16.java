package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q16 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.instagram.com");
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Aryan");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("Hello");

	}

}
