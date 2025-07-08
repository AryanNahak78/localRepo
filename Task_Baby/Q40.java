package Task_Baby;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q40 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.yahoo.com/");
		driver.findElement(By.xpath("//*[@*=\"Search the web\"]")).sendKeys("selenium");
		Thread.sleep(1000);
		List<WebElement> elements = driver.findElements(By.xpath("//b[text()=\"selenium\"]/.."));
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().equals("selenium download")) {
				elements.get(i).click();
			}		
}
	}

}
