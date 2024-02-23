package TESTPACK;

import org.testng.annotations.Test;

import PAGEOBJECT.POM;
import PAGEOBJECT.addemp;
import PAGEOBJECT.compoff;
import PAGEOBJECT.empinfo;
import PAGEOBJECT.importemp;
import PAGEOBJECT.payroll;

public class TESTCLASS extends BASECLASS{
@Test(priority=0)
public void logintest() throws InterruptedException
{
	driver.get(url);
	POM PM=new POM(driver);
	
	PM.setusername(username);
	PM.setpassword(password);
	PM.click();
	
	importemp emp=new importemp(driver);
	
	emp.clicklink();
	
	addemp add=new addemp(driver);
	add.addemployee();
	empinfo info=new empinfo(driver);
	info.wrightfullname("anshul");
	info.addpass("rudra1234");
	info.addcode("rudra12");
	info.addphone("9923456788");
	info.emailadd("rudraksh@gmail.com");
	info.adddept("Quality");
	info.adddesi("Project Manager");
	info.addrole("Employee");
	info.addgender("Male");
	info.addpm("Anshul Shukla");
	info.submit();

	Thread.sleep(5000);
}
@Test(priority=1)
public void checkcompoff()
{
	driver.get(url);
	compoff off=new compoff(driver);
	off.checkcmp();
}
@Test(priority=2)
public void payrolltest()
{
	driver.get(url);
	payroll py=new payroll(driver);
	py.payclick();
	py.plink();
	py.addsalary();
	py.salarystructure("90000");
	py.selectstaff();
	py.selectemp(name);;
}




}
