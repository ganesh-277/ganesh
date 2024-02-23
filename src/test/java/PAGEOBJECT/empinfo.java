package PAGEOBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class empinfo {
WebDriver ldriver;

public empinfo(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(xpath="(//input[@placeholder=\"Enter Employees Full Name\"])[1]") WebElement fullname;
@FindBy(xpath="(//input[@placeholder=\"Enter Employee's Email Address\"])[1]") WebElement email;
@FindBy(xpath="(//input[@placeholder=\"Enter Employee's Login Password\"])[1]") WebElement pass;
@FindBy(xpath="(//input[@placeholder=\"Enter Employee's code\"])[1]") WebElement empcode;
@FindBy(xpath="(//input[@data-parsley-debounce-message=\"Phone number should be 10 digits only\"])[1]") WebElement phonenumber;
@FindBy(xpath="(//select[@name=\"department\"])[1]") WebElement dept;
@FindBy(xpath="(//select[@placeholder=\"Select Designation\"])[1]") WebElement designation;
@FindBy(xpath="(//select[@placeholder=\"Select Role\"])[1]") WebElement role;
@FindBy(xpath="(//select[@placeholder=\"Select Reporting Maan\"])[1]") WebElement pm;
@FindBy(xpath="(//select[@name=\"gender\"])[1]") WebElement gender;
@FindBy(xpath="(//button[@type=\"submit\"])[1]") WebElement button;

public void wrightfullname(String name)
{
	fullname.sendKeys(name);
	
}
public void emailadd(String gmail)
{
	email.sendKeys(gmail);
	
}
public void addpass(String pwd)
{
	pass.sendKeys(pwd);
	
}
public void addcode(String code)
{
	empcode.sendKeys(code);
	
}
public void addphone(String phn)
{
	phonenumber.sendKeys(phn);
	
}
public void adddept(String deptname)
{
	Select sel=new Select(dept);
	 sel.selectByVisibleText(deptname);
	
}
public void adddesi(String Desiname)
{
	Select ds=new Select(designation);
	ds.selectByVisibleText(Desiname);
}
public void addrole(String Rolename)
{
	Select rl=new Select(role);
	rl.selectByVisibleText(Rolename);
}
public void addpm(String pmanager)
{
	Select rl=new Select(pm);
	rl.selectByVisibleText(pmanager);
}
public void addgender(String gen)
{
	Select rl=new Select(gender);
    rl.selectByVisibleText(gen);
}
public void submit()
{
	button.click();
}

	

}
