package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q26 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/walmart/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,\"toPassword\")]")).click();
	}

}
