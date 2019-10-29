package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Register {
	WebDriver anupama;
	@Given("user again accesses the demowebshop homepage")
	public void user_again_accesses_the_demowebshop_homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
        anupama= new ChromeDriver();
	    anupama.get("http://demowebshop.tricentis.com/");
	 
	}

	@Given("user again clicks on register link")
	public void user_again_clicks_on_register_link() {
		  anupama.findElement(By.xpath("//a[text()='Register']")).click();		  

	}
	@When("user now selects a {string}")
	public void user_now_selects_a(String stringa) {
		System.out.println(stringa);

		if(stringa.equals("male"))
		{
			  anupama.findElement(By.xpath("//input[@value='M']")).click();		  
		}
		else
		{
			  anupama.findElement(By.xpath("//input[@value='F']")).click();		
		}

	    
	}
	@When("user  now enters {string} and {string} and {string} and {string}")
	public void user_now_enters_and_and_and(String string, String string2, String string3, String string4) {
		 anupama.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(string);		  
		  anupama.findElement(By.xpath("//input[@name='LastName']")).sendKeys(string2);		  
		  anupama.findElement(By.xpath("//input[@name='Email']")).sendKeys(string3);		  
		  anupama.findElement(By.xpath("//input[@name='Password']")).sendKeys(string4);		  
		  anupama.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(string4);
	}
			  

	@When("clicks now on register")
	public void clicks_now_on_register() {
	  //anupama.findElement(By.xpath("//input[@name='register-button']")).click();		  

	}

	@Then("user should now access user page")
public void user_should_now_access_user_page() {
	String act=anupama.getCurrentUrl();
   String exp= "http://demowebshop.tricentis.com/registerresult/1";
 Assert.assertEquals(exp, act);
System.out.println("Successful login");
}


}
