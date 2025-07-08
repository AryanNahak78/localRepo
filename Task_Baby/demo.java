package Task_Baby;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		Robot robot=new Robot();
		driver.get("https://www.fb.com");
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		System.out.println(driver.getTitle());
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (driver.switchTo().window(string).getTitle().equals("New Tab")) {
				driver.switchTo().window(string);
			}
		}
		System.out.println(driver.getTitle());
		driver.get("https://www.instagram.com");
		System.out.println(driver.getTitle());
	}

}
