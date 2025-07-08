package Task_Baby;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q41 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]")).sendKeys("tommy");
		Thread.sleep(1000);
	List<WebElement> elements = driver.findElements(By.xpath("//*[@class=\"desktop-suggestion null\"]"));
	for (int i = 0; i < elements.size(); i++) {
if (elements.get(i).getText().equals("Tommy Hilfiger Wallets")) {
	elements.get(i).click();
	break;
}	
}
	if (driver.findElement(By.xpath("//*[@class=\"title-title\"]")).getText().equals("Tommy Hilfiger Wallets")) {
		System.out.println("Right page opened");
	}
	else
		System.out.println("Wrong page opened");
	driver.quit();
	}

}
