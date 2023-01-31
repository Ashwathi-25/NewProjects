package cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	      String url = "http://adactinhotelapp.com";
	      driver.get(url);
	      
	      driver.manage().window().maximize();
	      
	      WebElement name = driver.findElement(By.id("username"));
	      WebElement pwd = driver.findElement(By.id("password"));
	      name.sendKeys("AshPtest");
	      pwd.sendKeys("12345678");
	      driver.findElement(By.id("login")).click();

	}

}
