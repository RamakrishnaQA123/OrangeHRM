package WorkingwithLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Tc2 {

	public static void main(String[] args) {

		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.icicibank.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("no of links are"+"  "+links.size());
		
		
		
		
		
		
		
		
	}

}
