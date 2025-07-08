package Task_Baby;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Q45 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.fb.com/");
		driver.findElement(By.xpath("//*[text()=\"Create new account\"]")).sendKeys(Keys.ENTER);
		WebElement Day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select selectDay=new Select(Day);
		selectDay.selectByVisibleText("10");
		Thread.sleep(500);
		WebElement Month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select selectMonth=new Select(Month);
		selectMonth.selectByValue("9");
		Thread.sleep(500);
		WebElement Year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select selectYear=new Select(Year);
		selectYear.selectByVisibleText("2003");
	}

}
