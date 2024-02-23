package TESTPACK;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BASECLASS {
	
WebDriver driver;
public String username="admin@gmail.com";
public String  password="12345678";
public String url="https://develop.vacisautomation.com";
//public String wwblink="https://develop.vacisautomation.com/employees";
@BeforeClass
public void start()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\new driver\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
    options.setBinary("C:\\Users\\admin\\Desktop\\new chrome\\chrome-win64\\chrome.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
}
//@AfterClass
public void teardown()
{
	driver.quit();
}

}
