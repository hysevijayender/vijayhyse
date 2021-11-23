package hysework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Program3 {
	
	public WebDriver driver;
	
  @Test
  public void windowpopup() throws Exception {

	  //Clicks on Separate windows
	  driver.findElement(By.xpath("//a[@href='#Seperate'][contains(.,'Open New Seperate Windows')]")).click();
	  Thread.sleep(3000);  
	  
	  //Click_button
	  driver.findElement(By.xpath("//button[@class='btn btn-primary'][contains(.,'click')]")).click();
	  
	//comeback to Parent window handle
	String moveto_parentwindow = driver.getWindowHandle();
	

	//Child window handle  
for(String childwinhandle : driver.getWindowHandles()) {
	
	driver.switchTo().window(childwinhandle);
	
	
}
	
	
	
	
     //Clicks on Blog_Button
	driver.findElement(By.linkText("Blog")).click();
	  
	  
	  driver.close();
	  Thread.sleep(3000);
	  
		
		  //Again Switch focus back to Parent window
		  driver.switchTo().window(moveto_parentwindow); 
		  
		  Thread.sleep(3000);
		 
	  
	  //Clicks on Home_Buttons
		driver.findElement(By.linkText("Home")).click();

	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\vijay workspace\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }
}
