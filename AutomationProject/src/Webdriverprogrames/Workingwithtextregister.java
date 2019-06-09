package Webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Workingwithtextregister {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		  
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
		
driver.findElement(By.linkText("REGISTER")).click();


driver.findElement(By.name("firstName")).sendKeys("Evamka");	
driver.findElement(By.name("lastName")).sendKeys("TRUMP");
driver.findElement(By.name("phone")).sendKeys("100");
driver.findElement(By.id("userName")).sendKeys("evamka@US.com");
driver.findElement(By.name("address1")).sendKeys("Maduranagar");
driver.findElement(By.name("city")).sendKeys("HYD");
driver.findElement(By.name("state")).sendKeys("TG");
driver.findElement(By.name("postalCode")).sendKeys("108");
driver.findElement(By.name("country")).sendKeys("INDIA");
driver.findElement(By.id("email")).sendKeys("Trump");
driver.findElement(By.name("password")).sendKeys("12345");
driver.findElement(By.name("confirmPassword")).sendKeys("12345");
driver.findElement(By.name("register")).click();

Sleeper.sleepTightInSeconds(5);
String Actual=driver.findElement(By.xpath("html/body/div[1]/table/tbody"
		+ "/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/t"
		+ "body/tr[3]/td/p[3]/a/font/b")).getText();
String Expected="Trump";
if(Actual.contains(Expected)){
	System.out.println("Registe Succ");
}
else{
	System.out.println("Register fail");
}








		
		
		
	}

}
