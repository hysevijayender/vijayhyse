package hysework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A8_Boolean_Oneway {

	public WebDriver driver;
	
  @Test
  public void options() {
	  
	  
	  //Switching to Roundtrip
	  driver.findElement(By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home[1]/div[1]/app-home-container[1]/div[1]/div[1]/div[2]/app-outstation[1]/div[1]/div[1]/div[1]/label[2]/span[1]")).click();
	  
	  //Print Condition True or False	  
	boolean printcondition = driver.findElement(By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home[1]/div[1]/app-home-container[1]/div[1]/div[1]/div[2]/app-outstation[1]/div[1]/div[1]/div[1]/label[2]/span[1]")).isDisplayed();
	  
	System.out.println(printcondition);
	
	
	
	WebElement element = driver.findElement(By.xpath("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home[1]/div[1]/app-home-container[1]/div[1]/div[1]/div[2]/app-outstation[1]/div[1]/div[1]/div[1]/label[2]/span[1]"));
	
	
			
			if (element.isEnabled()) {
				
				System.out.println("Passed");
				
			} else {
				
				System.out.println("Fail");
			}
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\vijay workspace\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();


  }

  @AfterTest
  public void afterTest() {
	  
  }

}
