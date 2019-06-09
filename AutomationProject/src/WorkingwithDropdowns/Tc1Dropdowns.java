package WorkingwithDropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Tc1Dropdowns {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.mercurytravels.co.in/");
		
		WebElement dropdown=driver.findElement(By.id("themes"));
		
	List<WebElement>value=dropdown.findElements(By.tagName("option"));
	
	for(int i=0;i<value.size();i++){
		String name=value.get(i).getText();
		     value.get(i).click();
		   if(value.get(i).isDisplayed()){
			   System.out.println(name+"   "+"Active");
		   }
		   else{
			   System.out.println(name+"   "+"In Active");
		   }
		
	}

		
		
	}

}
