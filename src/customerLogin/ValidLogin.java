package customerLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidLogin {
	
	public static void main(String[] args) {
		
		//to set the property  iof the test
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Iykedagenius\\Desktop\\summit\\chromedriver_win32\\chromedriver.exe");
		
		//to instance of driver
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.jumia.com.ng/");
		
		driver.findElement(By.xpath(" //label[contains(text(),'Login')]")).click();
		
		driver.findElement(By.xpath("//a[@class='btn _prim -fw _md']")).click();
		
		driver.close();
		
		
	}

}
