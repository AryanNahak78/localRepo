package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q31 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.xpath("/html//input[@id=\"email\"]")).sendKeys("Aryan_Nahak");
	}

}
