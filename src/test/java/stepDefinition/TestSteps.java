package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class TestSteps {
	
	WebDriver driver;
	String usName = "";
	
	@Given("when user is on the login page")
	public void when_user_is_on_the_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		  driver = new ChromeDriver();
		
	      String url = "http://adactinhotelapp.com";
	      driver.get(url);
	      driver.manage().window().maximize();
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	      WebElement name = driver.findElement(By.id("username"));
	      WebElement pwd = driver.findElement(By.id("password"));
	      name.sendKeys("AshPTest");
	      usName = "AshPTest";
	      pwd.sendKeys("12345678");
    }   
	
	@When("user enters \"(.*)\", \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
	      WebElement name = driver.findElement(By.id("username"));
	      WebElement pwd = driver.findElement(By.id("password"));
	      name.sendKeys(username);
	      usName = username;
	      pwd.sendKeys(password);

	 }

	
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@Then("Login is successfull")
	public void login_is_successfull() {
	    String text = driver.findElement(By.id("username_show")).getAttribute("value");
	    System.out.println(text);
	    assertEquals(text, "Hello "+ usName + "!");
	}

	@Then("Search hotel page is displayed")
	public void search_hotel_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("page inside");

	}
	
	@When("user selects \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\"$")
	public void user_selects(String location, String numberofrooms, String checkindate, String checkoutdate, String adultsperroom) {
		//Drop down  to select LOCATION
        new Select(driver.findElement(By.className("search_combobox"))).selectByValue(location);


        //Drop down to select Number of Rooms
         new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText(numberofrooms);

         //Date picker-Enter check in date
         WebElement checkin = driver.findElement(By.id("datepick_in"));
         checkin.clear();
         checkin.sendKeys(checkindate);

         //Date picker-Enter checkout date
         WebElement checkout = driver.findElement(By.id("datepick_out"));
         checkout.clear();
         checkout.sendKeys(checkoutdate);

         //Select Adults per room
         new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText(adultsperroom);
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
		//Click on Search
		driver.findElement(By.id("Submit")).click();
	}

	@Then("search results should be displayed")
	public void search_results_should_be_displayed() {
		System.out.println("Successful search page");
	}

	@Given("This is a blank test")
	public void this_is_a_blank_test() {
	   System.out.println("Tested!");
	}

}
