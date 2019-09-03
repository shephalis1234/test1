package pro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pro.base.baseclass;
@Listeners(listener.class)
public class project extends baseclass {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		initialization();
		System.out.println("start");
	}

@Test
public void test1() {
	System.out.println("i");
	Assert.assertEquals(false,true);
}
@Test
public void test2() {
	System.out.println("i");
	Assert.assertEquals(false,true);
}

@AfterMethod
public void teardown() {
	
//	driver.close();
	System.out.println("end");
}

}
