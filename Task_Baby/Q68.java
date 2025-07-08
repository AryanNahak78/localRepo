package Task_Baby;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q68 {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.hdfcbank.com/");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Select Product Type'])[1]")));
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		driver.findElement(By.xpath("//*[text()='Life Insurance']")).click();

		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		driver.findElement(By.xpath("//*[text()='Pension Plans']")).click();

		driver.findElement(By.xpath("//*[text()='Apply online']")).click();
		System.out.println(driver.getTitle());
		Set<String> windowHandles = driver.getWindowHandles();		
		for (String string : windowHandles) {
			if (driver.switchTo().window(string).getTitle().equals("HDFC Life Guaranteed Pension Plan")) {
				driver.switchTo().window(string);
				break;
			}
		}
		System.out.println(driver.getTitle());
	}
}
