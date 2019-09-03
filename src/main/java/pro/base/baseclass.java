package pro.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {

	public static WebDriver driver;
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	public void failed(String testmethod) {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			//FileUtils.copyFile(source, new File("C:\\Users\\user\\eclipse-workspace\\pro\\screenshot\\fail1.jpg"));
			FileUtils.copyFile(source, new File("C:\\Users\\user\\eclipse-workspace\\pro\\screenshot\\"+testmethod+"_"+ ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
