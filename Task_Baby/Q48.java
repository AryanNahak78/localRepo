package Task_Baby;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Q48 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("Pke_EE")).sendKeys("mobiles");
		Thread.sleep(1000);
		//driver.manage().window().maximize();
		List<WebElement> Mobiles = driver.findElements(By.xpath("//*[@*='_3D0G9a']"));
		for (int i = 0; i < Mobiles.size(); i++) {
			if (Mobiles.get(i).getText().contains("mobiles 5g")) {
				Thread.sleep(3000);
				Mobiles.get(i).click();
				System.out.println("ok");
				break;
			}
		}
			Thread.sleep(1000);
		Actions action=new Actions(driver);
		while (true) {
			WebElement leftSlider = driver.findElement(By.xpath("//*[@class='iToJ4v Kaqq1s']"));
			Integer leftSliderInt=Integer.parseInt(leftSlider.getAttribute("style").replaceAll("[^0-9]",""));
			if (leftSliderInt<47362) {
				action.dragAndDropBy(leftSlider,(int)47.362, 0).perform();
				Thread.sleep(1000);
				System.out.println(leftSliderInt);
			}
			else
				break;
		}
		Thread.sleep(500);
		while (true) {
			WebElement rightSlider = driver.findElement(By.xpath("//*[@*='iToJ4v D0puJn']"));
			int rightSliderInt = Integer.parseInt(rightSlider.getAttribute("style").replaceAll("[^0-9]", ""));
			if (rightSliderInt<95000) {
				action.dragAndDropBy(rightSlider, -119, 0).perform();
				Thread.sleep(1000);
				System.out.println(rightSliderInt);
				//Thread.sleep(500);
			}
			else
				break;
		}
		WebElement minPriceElement = driver.findElement(By.xpath("(//*[@*='Gn+jFg'])[1]"));
		Select minPrice=new Select(minPriceElement);
		Thread.sleep(500);
		if (minPrice.getFirstSelectedOption().getText().contains("10000")) {
			System.out.println("Minimum price selected is : "+ minPrice.getFirstSelectedOption().getText());
		}
		WebElement maxPriceElement = driver.findElement(By.xpath("(//*[@*='Gn+jFg'])[2]"));
		Select maxPrice=new Select(maxPriceElement);
		Thread.sleep(500);
		if (maxPrice.getFirstSelectedOption().getText().contains("20000")) {
			System.out.println("Maximum price selected is : "+ maxPrice.getFirstSelectedOption().getText());
		}
	}
}

