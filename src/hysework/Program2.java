package hysework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Program2 {
	
	public WebDriver driver;
	public Actions action;
	
	
  @Test
  public void Mouseoover() throws Exception {
	  action = new Actions(driver);
		
	  WebElement ele = driver.findElement(By.linkText("SwitchTo"));
	 	  
	 	  //Action command
	 	action.moveToElement(ele).build().perform();
	 	
	 	
	 	Thread.sleep(6000);
	 	  
	 	  //windows
	 	  driver.findElement(By.linkText("Windows")).click();
	 	  Thread.sleep(6000);  
	 	
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
