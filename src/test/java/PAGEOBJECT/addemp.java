package PAGEOBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addemp {
	WebDriver ldriver;
	
	
	public addemp(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//a[@data-bs-target=\"#add_employee\"]") WebElement add;
	
	public void addemployee()
	{
	add.click();
	}

}
