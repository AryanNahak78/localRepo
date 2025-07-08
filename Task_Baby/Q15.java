package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q15 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://login.yahoo.com/account/create?");
		driver.findElement(By.cssSelector("input[id=\"usernamereg-firstName\"]")).sendKeys("Aryan");		
		driver.findElement(By.cssSelector("input[id=\"usernamereg-lastName\"]")).sendKeys("Nahak");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("aryannahak78");
		driver.findElement(By.cssSelector("input[aria-label=\"Password\"]")).sendKeys("Hello");
		Thread.sleep(3000);
		driver.quit();
	}

}
