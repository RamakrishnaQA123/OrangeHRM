package WorkingwithLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Tc1VerifyGmailTitle {

	public static void main(String[] args) {

		
		//open browser navigate to Google
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		
		//click on Gmail link
driver.findElement(By.linkText("Gmail")).click();

//verify Title

String Expected="Gmail";

String Actual=driver.getTitle();
System.out.println(Actual);
if(Actual.contains(Expected)){
	System.out.println("TC pass");
}
else{
	System.out.println("TC fail");
}











		
		
	}

}
