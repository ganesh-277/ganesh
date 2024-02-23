package PAGEOBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class payroll {
	 WebDriver ldriver;

	public payroll(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath="(//a[@href='#'])[8]") WebElement pay;
	@FindBy(linkText= "Salary Structure") WebElement link;
	@FindBy(xpath="//a[@data-bs-target=\"#add_salary\"]") WebElement salarystructure;
	@FindBy(xpath="(//input[@name=\"grossSalary\"])[1]") WebElement amt;
	@FindBy(xpath="//a[@class=\"chosen-single\" ]") WebElement staff;
	@FindBy(xpath="(//div[@class=\"chosen-search\"] )[1]") WebElement ename;
	
	
	
	
	public void payclick()
	{
		pay.click();
	}
	public void plink()
	{
		link.click();
	}
	public void addsalary()
	{
		salarystructure.click();
	}
	public void salarystructure(String num)
	{
		
		amt.sendKeys(num);
	}
	public void selectstaff()
	{
		
		staff.click();
	}
	public void selectemp(WebElement name)
	{
	 Actions act=new Actions(ldriver);
	  act.moveToElement(name).perform();
	 
	
	}


}
