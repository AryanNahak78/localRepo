package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q20 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://login.yahoo.com/account/create?");
		driver.findElement(By.xpath("//input[@id=\"usernamereg-firstName\"]")).sendKeys("Aryan");
		driver.findElement(By.xpath("//input[@id=\"usernamereg-lastName\"]")).sendKeys("Nahak");
		driver.findElement(By.xpath("//input[@name=\"userId\"]")).sendKeys("aryannahak78");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("@123@456@");
	}

}
