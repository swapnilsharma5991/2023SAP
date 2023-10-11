package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import com.qa.Rediff.base.base;
import com.Rediff.Constants.Constants;


public class Rediff_createNewAccountTest extends base {
		
	public Rediff_createNewAccountTest() throws IOException {
		super();
		
	}
	
	@BeforeTest
	public void setUp() throws IOException{
		initializeDriver();	
		System.out.println("Before");	
	}
	
	@Test(priority=1)
	public void rediffmethod1() throws IOException, InterruptedException {
		System.out.println("Test 3 CreateAccount");	
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		System.out.println("Teardown");
		Thread.sleep(1000);
		driver.quit();
	}
}
