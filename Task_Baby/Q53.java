package Task_Baby;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q53 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[text()='Prompt Alert Box']")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.sendKeys("yes");
		Thread.sleep(1000);
		alert.accept();
		String PromptText = driver.findElement(By.xpath("//*[contains(text(),'yes')]")).getText();
		if (PromptText.contains("selected")) {
			System.out.println("prompt popup handled");
		}		
		else
			System.out.println("not handled");
	}

}
