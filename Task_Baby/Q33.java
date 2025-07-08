package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q33 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.findElement(By.xpath("//input[@type=\"password\"]/../../../../../../../../../../../../../../..")).getTagName());
		if (driver.findElement(By.xpath("//input[@type=\"password\"]/../../../../../../../../../../../../../../..")).getTagName().equals("html")) {
			System.out.println("validate");
		}
		else
			System.out.println("not validate");
	}
}
