package mavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class GoogleTest {
	WebDriver driver;
  @Test
  public void f() {
	  String expected = "Google";
	  String actual = driver.getTitle();
	  Assert.assertEquals(actual, expected);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\IBM_SeleniumWD\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
