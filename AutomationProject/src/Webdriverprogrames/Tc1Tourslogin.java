package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc1Tourslogin {

	public static void main(String[] args) {

		//open browser navigate to newtours
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	
		//verify tours login
		
	   driver.findElement(By.name("userName")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("mercury");
	    driver.findElement(By.name("login")).click();
		
		
	}

}
