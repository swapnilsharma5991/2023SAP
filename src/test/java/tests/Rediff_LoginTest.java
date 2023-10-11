package tests;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import com.qa.Rediff.base.base;
import com.Rediff.Constants.Constants;


public class Rediff_LoginTest extends base {
	
	public Rediff_LoginTest() throws IOException {
		super();
		
	}
	
	@BeforeTest
	public void setUp() throws IOException{
		initializeDriver();	
		System.out.println("Before");	
	}
	
	@Test(priority=1)
	public void rediffmethod1() throws IOException, InterruptedException {
		System.out.println("Test 2 login");	
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		System.out.println("Teardown");
		Thread.sleep(1000);
		driver.quit();
	}
}
