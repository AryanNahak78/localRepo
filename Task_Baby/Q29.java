package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q29 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.cssSelector("a[data-testid=\"open-registration-form-button\"]")).click();
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
	}

}
