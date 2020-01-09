//package step_definations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class loginStep_definations {
//
//	WebDriver driver;
//	
//	@Given ("^user is already on login page$")
//	public void user_already_on_login_page() {
//		
//		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		driver.get("http://www.freecrm.com");
//	}
//	
//	@When ("^title of login page is FreeCRM$")
//	public void title_of_login_page_FreeCRM() {
//		String title = driver.getTitle();
//		System.out.println("Login Page Title: " +title);
//		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
//		
//	}
//	
//	@Then("^user enters \"(.*)\" and \"(.*)\"$") // using Regular Expression \"(.*)\" or \"([^\"]*)" to connect with the data in feature file
//	public void user_enters_username_and_password(String username, String password) {
//		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_clicks_login_button() {
//		driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
//	}
//
//	@Then("^user is on homepage$")
//	public void user_is_on_homepage() {
//	    String title = driver.getTitle();
//	    System.out.println("HomePage Title: " +title);
//	    Assert.assertEquals(title, "Cogmento CRM");
//	    
//	    driver.quit();
//	}
//}