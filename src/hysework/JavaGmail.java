package hysework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaGmail {
	
	public WebDriver driver;

		public void openurl() {
			
			driver = new ChromeDriver();
			driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");	
		
		}
		
		
		public void login() {
			
	driver.findElement(By.id("identifierid")).sendKeys("swamykumartesting@gmail.com");
			
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

	driver.findElement(By.name("password")).sendKeys("9999123456");
			
		}
		
		
		public void compose() {
			
			driver.findElement(By.xpath("//*[@id=\":kr\"]/div/div")).click();
			
		}
		
		
		public void logout() {
			
		}
		
		
		

	public static void main(String[] args) {

		JavaGmail r = new JavaGmail();
		r.openurl();
		r.login();
		r.compose();
		r.logout();
	}

}
