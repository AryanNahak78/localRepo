package Task_Baby;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q50 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement Clicked = driver.findElement(By.xpath("//*[contains(text(),'Clicked')]"));
		if (Clicked.getText().contains("Clicked")) {
			System.out.println("popup clicked");
		}
	}

}
