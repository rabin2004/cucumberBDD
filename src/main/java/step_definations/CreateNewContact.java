//package step_definations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class CreateNewContact {
//
//	WebDriver driver;
//	
//	@Given("^user is already in homepage$")
//	public void user_is_already_in_homepage() {
//		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		driver.get("http://www.freecrm.com");
//		
//		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
//		driver.findElement(By.name("email")).sendKeys("rabin2004@yahoo.com");
//		driver.findElement(By.name("password")).sendKeys("SunXiang@20110611");
//		driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
//	
//	@And ("^user clicks on contact tab$")
//	public void user_clicks_on_contact_tab() {
//	   driver.findElement(By.linkText("Contacts")).click();
//	}
//	
//	@When("^user enters contact data \"(.*)\", \"(.*)\", \"(.*)\" and \"(.*)\"$")
//	public void user_enters_first_name_last_name_company_name_email_address(String firstName, String lastName, String company, String emailAddress) {
//	   driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
//	   driver.findElement(By.name("first_name")).sendKeys(firstName);
//	   driver.findElement(By.name("last_name")).sendKeys(lastName);
//	   driver.findElement(By.xpath("//input[@class='search']")).sendKeys(company);
//	   driver.findElement(By.name("value")).sendKeys(emailAddress);
//	}
//	
//	@And("^user clicks on save button$")
//	public void user_clicks_on_save_button() {
//		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
//	  
//	}
//	
//	@Then("^new contact should be created$")
//	public void new_contact_should_be_created() {
//		String title = driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[1]")).getText();
//		Assert.assertEquals(title, "Tom Clancy");
//		
//		driver.quit();
//	
//	 
//	}
//}
