package Task_Baby;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q54 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='ui-datepicker-trigger'])[2]")).click();
          while (true) {
      		WebElement monthYear = driver.findElement(By.xpath("(//*[@*='ui-datepicker-title'])[2]"));    
        	  String month = (monthYear.getText().split(" "))[0];
              String Year = (monthYear.getText().split(" "))[1];
              if (month.equals("December") && Year.equals("2025")) {
				Thread.sleep(500);
				driver.findElement(By.xpath("((//*[@*='selectDay']/../..)[2]//td)[21]")).click();
				break;
			}
              else
  				driver.findElement(By.xpath("//*[@data-handler='next']")).click();
             Thread.sleep(1000);
		}
	
	}

}
