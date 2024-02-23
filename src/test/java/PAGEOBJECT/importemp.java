package PAGEOBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class importemp {
	
	WebDriver ldriver;
	
	
	public importemp(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="(//span[text()='Employees'])[2]") WebElement weblink;
	
	public void clicklink()
	{
	weblink.click();
	}

}
