package Task_Baby;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q35 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com");
		List<WebElement> elements = driver.findElements(By.xpath("//a[@class=\"desktop-main\"]"));
		System.out.println(elements.size());
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}
	}

}
