package step_definations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dealsTest {
	
	WebDriver driver;
	
	@Given ("^user is already on login page$")
	public void user_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");
	}
	
	@When ("^title of login page is FreeCRM$")
	public void title_of_login_page_FreeCRM() {
		String title = driver.getTitle();
		System.out.println("Login Page Title: " +title);
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
		
	}
	
	@Then("^user enters username and password$") // using Regular Expression \"(.*)\" or \"([^\"]*)" to connect with the data in feature file
	public void user_enters_username_and_password(DataTable credentials) {
		List<List<String>> loginData = credentials.raw();
		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		driver.findElement(By.name("email")).sendKeys(loginData.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(loginData.get(0).get(1));
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_login_button() {
		driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
	}

	@And("^user is on homepage$")
	public void user_is_on_homepage() {
	    String title = driver.getTitle();
	    System.out.println("HomePage Title: " +title);
	    Assert.assertEquals(title, "Cogmento CRM");
	    
	}
	
	 @Then ("^user moves to new deal page$")
	 public void user_moves_to_new_deal_page() {
		 driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[5]/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]")).click();
		 String dealPage = driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[1]")).getText();
		 Assert.assertEquals(dealPage, "Create new Deal");
	 }
	 
	 @Then ("^user enters deal details$")
	 public void user_enter_deal_details(DataTable dealsData) {
		 List<List<String>>dealData = dealsData.raw();
		 driver.findElement(By.name("title")).sendKeys(dealData.get(0).get(0));
		 driver.findElement(By.name("description")).sendKeys(dealData.get(0).get(1));
		 driver.findElement(By.name("commission")).sendKeys(dealData.get(0).get(2));
		 driver.findElement(By.name("amount")).sendKeys(dealData.get(0).get(3));
	 }
	 
	 @Then ("^user clicks save$")
	 public void user_clicks_save() {
		 driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
		 String dealsCreated = driver.getTitle();
		 Assert.assertEquals(dealsCreated, "Cogmento CRM");
	 }
	 		
	 @Then ("^close the browser$")
	 public void close_the_browser() {
		 driver.quit();
	 }
}
