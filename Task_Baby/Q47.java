package Task_Baby;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q47 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demoapps.qspiders.com/ui/slider?sublist=0");
		WebElement Slider = driver.findElement(By.xpath("//*[@type=\"range\"]"));
		while (true)
		{
			Integer sliderIntValue=Integer.parseInt(Slider.getAttribute("value"));
			Thread.sleep(1000);
			System.out.println(sliderIntValue);
			Actions action=new Actions(driver);
			if (sliderIntValue<70) 
			{
			action.dragAndDropBy(Slider, 5, 0).perform();
			System.out.println("a");
			}
			else 
			{
				System.out.println(sliderIntValue);
				break;
			}
		}
	
	}

}
