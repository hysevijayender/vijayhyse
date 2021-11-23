package hysework;

import org.testng.annotations.Test;

import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Introscript {
			                                                   
	public WebDriver driver;
	
 @Test
 public void information() throws Exception {
	  // first name
	  driver.findElement(By.id("firstName")).sendKeys("vikram");
	  
	  // last name
	  driver.findElement(By.id("lastName")).sendKeys("rathod");
	  
	  //email
	 driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("vikramrathhod@gmail.com");
	
	 //gender
	 driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	 
	 //mobile number
	 driver.findElement(By.id("userNumber")).sendKeys("9290064985");
	 
	 // date of birth
	 driver.findElement(By.id("dateOfBirthInput")).click();
	 
	//new select(driver.findElement(By.xpath("//*[@id="dateOfBirth"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectbyvisibletext("1997");
	 
	 //subject
	 driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("English");
	 
	 driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("Maths");
	 
	 driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("Science");
	 
	 //hobbies
	driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
	
	//picture
	driver.findElement(By.id("uploadPicture")).click();
	
	driver.findElement(By.id("currentAddress")).sendKeys("rangareddy");
	
	driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).sendKeys("NCR");
	
	driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]")).sendKeys("Delhi");
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[3]")).click();
 
 }
 
 
  @BeforeTest
  public void beforeTest() {
	  			
 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\vijay workspace\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.get("https://demoqa.com/automation-pratice-form");
 driver.manage().window().maximize();
 
  }		

  @AfterTest
  public void afterTest() {
	  
  }

}
