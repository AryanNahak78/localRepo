package Task_Baby;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q34 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com");
		List<WebElement> hyperlinks=driver.findElements(By.xpath("//a[contains(@href,\"\")]"));
		System.out.println(hyperlinks.size());
		for (int i = 0; i < hyperlinks.size(); i++) {
			System.out.println(hyperlinks.get(i).getText());
			System.out.println(hyperlinks.get(i).getAttribute("href"));
		}
	}

}
