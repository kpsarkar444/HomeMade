package FreshPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstOne {

	@Test
	public static void Test1() {
		
			
			WebDriver  driver = new FirefoxDriver();
			driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
			Alert alt = driver.switchTo().alert();
			String msg = alt.getText();
			System.out.println(msg);

			driver.manage().timeouts().implicitlyWait(20, TimesUnit.SECONDS);

		
		
		}

	}
