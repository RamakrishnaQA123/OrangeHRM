package WorkingwithRadios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Tc1Count {

	public static void main(String[] args) {
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		  
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.spicejet.com/");
		
	WebElement student=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));	
		
         student.click();
         
         if(student.isSelected()){
        	 System.out.println("student checkbox  pass");
         }
         else{
        	 System.out.println("student Checkbox fail");
         }
		
	}

}
