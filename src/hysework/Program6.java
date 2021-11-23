package hysework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Program6 {
	
	public WebDriver driver;
	
	
  @Test
  public void optionss() throws Exception {
	  
	  WebElement ele = new Select(driver.findElement(By.id("day"))).getFirstSelectedOption();

		System.out.println(ele.getText());
		
		
		
	if (ele.getText().equalsIgnoreCase("14")) {
		
		System.out.println("PASS");
		
	} else {
		
		System.out.println("Fail");

	}

		
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\vijay workspace\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id");
	  driver.manage().window().maximize();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
