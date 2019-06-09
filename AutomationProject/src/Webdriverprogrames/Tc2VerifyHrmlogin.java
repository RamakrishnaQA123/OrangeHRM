package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Tc2VerifyHrmlogin {

	public static void main(String[] args) {

		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");	
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
Sleeper.sleepTightInSeconds(5);   

	driver.findElement(By.linkText("Welcome Admin")).click();
	driver.findElement(By.linkText("Logout")).click();
	
	
	
		
		
		
		
		
	}

}
