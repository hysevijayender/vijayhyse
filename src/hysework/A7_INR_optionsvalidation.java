package hysework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A7_INR_optionsvalidation {

	public WebDriver driver;

	@Test
  public void options() {
		
		  
//List<WebElement> allvalues = new Select(driver.findElement(By.id("day"))).getOptions();
List<WebElement> allvalues= new Select(driver.findElement(By.id("day"))).getOptions();


//Printing value by Index mode
System.out.println(allvalues.get(21).getText());


for (int i = 0; i < allvalues.size(); i++) {
	
	System.out.println(allvalues.get(i).getText());
	

	if (allvalues.get(i).getText().contains("31")) {
		
		System.out.println(allvalues.get(i).getText());
		System.out.println("Its passed");
		
	} else {
		
		System.out.println("Not there");

	}  
  
  }
	}
 



	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\vijay workspace\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demo.automationtesting.in/Register.html");
		  driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		
		

	}

}
