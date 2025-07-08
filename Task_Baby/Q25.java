package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q25 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/walmart/login.do");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,\"www.actitime\")]")).click();

	}

}
