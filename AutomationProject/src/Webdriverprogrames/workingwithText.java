package Webdriverprogrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class workingwithText {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		  
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://mercurytravels.co.in");
		
		//count no of links
List<WebElement>Elements=driver.findElements(By.tagName("a"));
   System.out.println("no of links are"+"   "+Elements.size());
       //count no of images
   Elements=driver.findElements(By.tagName("img"));
   System.out.println("no of images are"+Elements.size());
   
     //count no of dropdowns
    
   Elements=driver.findElements(By.tagName("select"));
   System.out.println("no of Dropdowns are"+"  "+Elements.size());
   
   //count no of radios'
   Elements=driver.findElements(By.xpath("//input[@type='radio']"));
   System.out.println("no of Elements are"+"   "+Elements.size());

        
		
		
		
		
	}	
}
