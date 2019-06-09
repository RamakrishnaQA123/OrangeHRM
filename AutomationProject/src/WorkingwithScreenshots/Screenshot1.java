package WorkingwithScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Screenshot1 {

	public static void main(String[] args) throws IOException  {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineqa");
		  
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		
File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile,new File("C:\\Users\\LENOVO\\Desktop\\proof.png"));
		
		
		driver.close();
		
	}

}
