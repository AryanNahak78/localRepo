package Task_Baby;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q46 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		driver.findElement(By.xpath("(//*[@placeholder=\"City or airport\"])[1]")).sendKeys("san");
		List<WebElement> FromCities = driver.findElements(By.xpath("//*[@class=\"ui-corner-all\"]"));
		for (int i = 0; i < FromCities.size(); i++) {
			if (FromCities.get(i).getText().equals("San Diego (SAN), California, USA")) {
				FromCities.get(i).click();
			}
		}
		driver.findElement(By.xpath("(//*[@placeholder=\"City or airport\"])[2]")).sendKeys("las");
		List<WebElement> ToCities = driver.findElements(By.xpath("//*[@class=\"ui-corner-all\"]"));
		for (int i = 0; i < ToCities.size(); i++) {
			if (ToCities.get(i).getText().equals("Las Vegas (LAS), Nevada, USA")) {
				ToCities.get(i).click();
			}
		}
		WebElement Adult = driver.findElement(By.xpath("//*[@name=\"adults\"]"));
		Select selectAdult=new Select(Adult);
		selectAdult.selectByVisibleText("4");
		
		WebElement Children = driver.findElement(By.xpath("//*[@name=\"children\"]"));
		Select selectChildren=new Select(Children);
		selectChildren.selectByVisibleText("3");
	}

}
