package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q38 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(@class,\"menu-item--name\")])[9]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,\"orangehrm-directory-card\")]/p[text()=\"Peter Mac Anderson \"]/..")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()=\"Peter Mac Anderson \"]/../p[contains(@class,\"orangehrm-directory-card-subtitle\")]")).getText());
		driver.quit();
	}

}
