package PAGEOBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	 WebDriver ldriver;
	@FindBy(xpath="//input[@name=\"email\"]") WebElement uname;
	@FindBy(xpath="//input[@name=\"password\"]") WebElement pass;
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement btn;
	
	public POM(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
		
	}
	
	public void setusername(String uid)
	{
		uname.sendKeys(uid);
	}
	public void setpassword(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void click()
	{
		btn.click();
	}


}
