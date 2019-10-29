package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class invalidcart {
	WebDriver anupama;
	@Given("alex is on demowebshop home page")
	public void alex_is_on_demowebshop_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
        anupama= new ChromeDriver();
	    anupama.get("http://demowebshop.tricentis.com/");
	   
	}

	@When("Alex searches for a product")
	public void alex_searches_for_a_product() {
		  anupama.findElement(By.xpath("//input[@name='q']")).sendKeys("computer");		  

	   
	}

	@When("Alex clicks on search")
	public void alex_clicks_on_search() {
		  anupama.findElement(By.xpath("//input[@value='Search']")).click();	  

	}

	@When("clicks on shopping cart")
	public void clicks_on_shopping_cart() {
		  anupama.findElement(By.xpath("//span[text()='Shopping cart']")).click();	  

	    
	}

	@Then("he sees Your Shopping Cart is empty!")
	public void he_sees_Your_Shopping_Cart_is_empty() {
		String act=anupama.findElement(By.className("order-summary-content")).getText();
		String exp="Your Shopping Cart is empty!";
		Assert.assertEquals(exp, act);
		System.out.println("Correct message");

	    
	}
	@Given("alex  now is on demowebshop home page")
	public void alex_now_is_on_demowebshop_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
        anupama= new ChromeDriver();
	    anupama.get("http://demowebshop.tricentis.com/");
	}

	@When("Alex now searches for a product")
	public void alex_now_searches_for_a_product() {
		  anupama.findElement(By.xpath("//input[@name='q']")).sendKeys("computer");		  

	}

	@When("Alex againclicks on search")
	public void alex_againclicks_on_search() {
		  anupama.findElement(By.xpath("//input[@value='Search']")).click();	  

	}

	@When("clicks again on add to cart")
	public void clicks_again_on_add_to_cart() throws InterruptedException {
		  anupama.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[3]/div[2]/input")).click();	  
		  Thread.sleep(3000);
		  anupama.findElement(By.xpath("//input[@data-productid='72']")).click();	  

	}

	@When("clicks againon shopping cart")
	public void clicks_againon_shopping_cart() {
		  anupama.findElement(By.xpath("//span[text()='Shopping cart']")).click();	  

	    
	}

	@Then("Alex finds the product in the cart")
	public void he_finds_the_product_in_the_cart() {
		assert(anupama.findElement(By.xpath("//button[@name='checkout']")).isEnabled());
		System.out.println("Success!");
	   
	}

}
