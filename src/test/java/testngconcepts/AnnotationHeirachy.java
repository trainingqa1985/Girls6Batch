package testngconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationHeirachy {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is before suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is after suite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is before Class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is after Class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is before Test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is after Test");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This will launch browser");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This will close browser");
	}
	@Test
	public void login()
	{
		System.out.println("This is my login");
	}
	@Test
	public void sendMessage()
	{
		System.out.println("This is sending message");
	}

}
