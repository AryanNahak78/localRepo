package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q30 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/walmart/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("trilochanmishra1993@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("GDvmdRaq");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class=\"menu_icon\"])[2]")).click();
				}
}
