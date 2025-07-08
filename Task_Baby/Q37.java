package Task_Baby;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q37 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/walmart/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("trilochanmishra1993@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("GDvmdRaq");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class=\"menu_icon\"])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=\"Types of Work\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()=\"New Type\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"title\"]")).sendKeys("Aryan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=\"Save\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=\"Aryan\"]/../../../../../..//div[@data-for=\"itemListPageTooltip\"]")).click();
	//	try {
			driver.findElement(By.xpath("//span[text()=\"Delete\"]")).click();
	//	} catch (Exception e) {}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"OK, Delete\"]")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class=\"containers-TypesOfWorkItemList-nameColumn--rwWrBeqc\"]"));
		System.out.println(elements.size());
		if (driver.findElements(By.xpath("//span[contains(@style,\"-webkit-line\")]")).contains("Aryan")) {
			System.out.println("Not Deleted");
		}
		else
			System.out.println("Deleted");
		driver.quit();
	}

}
