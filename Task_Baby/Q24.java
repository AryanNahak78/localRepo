package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q24 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,\"ref_type=registration_form\")]")).click();
	}

}
