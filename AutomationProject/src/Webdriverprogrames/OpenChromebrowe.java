package Webdriverprogrames;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromebrowe {

	public static void main(String[] args) {

		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\LENOVO\\Desktop\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
	}

}
