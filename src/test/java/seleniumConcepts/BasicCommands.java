package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicCommands {
	WebDriver driver;

	@BeforeMethod
	public void launcn() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:4200/pages/iot-dashboard");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@Test
	public void laucnBrowser() {
		// System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void Navigations() {

		Navigation navigation = driver.navigate();

		System.out.println(driver.getCurrentUrl());
		navigation.to("https://google.com");
		System.out.println(driver.getCurrentUrl());
		navigation.back();
		System.out.println(driver.getCurrentUrl());
		navigation.forward();
		System.out.println(driver.getCurrentUrl());
		navigation.refresh();

	}

}
