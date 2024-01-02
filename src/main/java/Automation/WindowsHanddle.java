package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHanddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Aniket\\Desktop\\chrome driver\\new\\chromedriver_win32 (7)//chromedriver.exe");

		 driver=new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 
		 driver.manage().window().maximize();
		 
		 driver.switchTo().newWindow(WindowType.TAB);
		 
		 Set<String> handdles=driver.getWindowHandles();
		 
		 Iterator<String> it=handdles.iterator();
		 
		 String ParentWindows=it.next();
		 String ChilildWindow=it.next();
		 
		 driver.switchTo().window(ChilildWindow);
		 
		 driver.get("https://rahulshettyacademy.com/");
		 
		 String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
	
		 System.out.println(courseName);
	}

}
