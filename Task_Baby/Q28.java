package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q28 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.netflix.com/in/");
		driver.findElement(By.xpath("//a[contains(@data-uia,\"header-\")]")).click();
		driver.findElement(By.xpath("//a[text()='Sign up now.']")).click();
	}

}
