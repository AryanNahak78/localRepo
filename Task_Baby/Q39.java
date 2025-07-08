package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q39 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://data.worldbank.org/indicator/SP.POP.TOTL");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Search data e.g. GDP, population, Indonesia\"]")).sendKeys("India");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Search data e.g. GDP, population, Indonesia\"]")).sendKeys(Keys.ENTER);
		 String text = driver.findElement(By.xpath("(//div[@data-text=\"India\"])[1]/../div[contains(text(),\"1,438\")]")).getText();
		 System.out.println("GDP of India is : "+ text);
		 driver.quit();
	}

}
