package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q18 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.netflix.com/in/login");
		driver.findElement(By.cssSelector("input[autocomplete=\"email\"]")).sendKeys("Aryan");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("123456789");
	}

}
