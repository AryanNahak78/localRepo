package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q19 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("Aryan");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Nahak");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("aryannahak78");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456789");
	}

}
