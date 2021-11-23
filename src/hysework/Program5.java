package hysework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Program5 {
	
	public WebDriver driver;
	
  @Test
  public void alertscreen() throws Exception {
	  
	  
	  driver.findElement(By.id("alertButton")).click();
		 
	  Thread.sleep(3000);
	  
	 String str = driver.switchTo().alert().getText();
	 
	 System.out.println(str);
	 
	  Thread.sleep(3000);
	 
	 driver.switchTo().alert().accept();
	 
		
		String ATM = "screen1";

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(scrFile, new File("E:\\hyse selenium script\\screenshots\\"+ATM+".png"));
	 
	  
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\vijay workspace\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
	  
	  String ATM = "Hyse";
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(scrFile, new File("E:\\hyse selenium script\\screenshots\\"+ATM+".png"));
		
	  
	  
  }

  @AfterTest
  public void afterTest() throws Exception {
	  
 String ATM = "screen2";
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  org.openqa.selenium.io.FileHandler.copy(scrFile, new File("E:\\hyse selenium script\\screenshots\\"+ATM+".png"));
	  
	 
	  driver.quit();
	
  }

}
