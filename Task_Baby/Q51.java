package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q51 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[contains(text(),'Confirm')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		WebElement Clicked = driver.findElement(By.xpath("//*[@*='pt-2 text-center']"));
		if (Clicked.getText().contains("Okay")) {
			System.out.println("popup clicked");
		}
	}

}
