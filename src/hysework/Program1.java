package hysework;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Program1{
	
	public WebDriver driver;
	

  @Test
  public void alert() throws Exception{
	  
	//Click ME button
			driver.findElement(By.id("alertButton")).click();
			
			driver.switchTo().alert().accept();
			
			driver.switchTo().alert().dismiss();
			
		
			String str = driver.switchTo().alert().getText();
			  
			  System.out.println(str);
			  
			 Thread.sleep(3000);
			  
			//Handling Alert
			driver.switchTo().alert().accept();


	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\vijay workspace\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
