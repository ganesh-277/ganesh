package PAGEOBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class compoff {
	
		WebDriver ldriver;

		public compoff(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}

		@FindBy(xpath="//span[text()='Compensatory Leave']") WebElement cmp;
		
		
		public void checkcmp()
		{
			cmp.click();
		}
	

}
