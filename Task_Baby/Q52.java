package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q52 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/walmart/login.do");
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("trilochanmishra1993@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("GDvmdRaq");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[text()='Users']")).click();
		driver.findElement(By.xpath("//*[text()='New User']/..")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@name='firstName'])[2]")).sendKeys("Aryan");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='components_button cancelBtn']")).click();
		Thread.sleep(1500);
		driver.switchTo().alert().dismiss();
		Thread.sleep(500);
		driver.quit();
	}

}
