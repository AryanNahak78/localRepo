package Task_Baby;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q74 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/table/tableSort");

		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Price ']")));
		driver.findElement(By.xpath("//*[text()='Price ']")).click();

		List<WebElement> ascOrder = driver.findElements(By.xpath("//tr[@*='bg-white border-b  hover:bg-orange-100']//td[4]"));
		List l1=new ArrayList();
		for (int i = 0; i < ascOrder.size(); i++) {
			l1.add(ascOrder.get(i).getText());
		}
		System.out.println("Ascending order is "+l1);

		driver.navigate().refresh();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@*='bg-white border-b  hover:bg-orange-100']//td[4]")));
		List<WebElement> randomOrder = driver.findElements(By.xpath("//tr[@*='bg-white border-b  hover:bg-orange-100']//td[4]"));
		List l2=new ArrayList();
		for (int i = 0; i <randomOrder.size(); i++) {
			l2.add(randomOrder.get(i).getText());
		}
		Collections.sort(l2);	
		System.out.println("Sort in Ascending is "+l2);
		if (l1.equals(l2)) {
			System.out.println("ascending order validated");
		}
		else
			System.out.println("Ascending order not validated");

		Thread.sleep(2000);
		System.out.println("--------------------------------------------------");	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Price ']")));
		driver.findElement(By.xpath("//*[text()='Price ']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[text()='Price ']")).click();

		List<WebElement> descOrder = driver.findElements(By.xpath("//tr[@*='bg-white border-b  hover:bg-orange-100']//td[4]"));
		List l3=new ArrayList();
		for (int i = 0; i < descOrder.size(); i++) {
			l3.add(descOrder.get(i).getText());
		}
		System.out.println("Descending oder is "+l3);	
		Collections.reverse(l1);
		System.out.println("Sort in descending is "+l1);

		if (l3.equals(l1)) {
			System.out.println("Descending order validated");
		}
		else
			System.out.println("Descending order not validated");
	}
}
