package pages;

import org.openqa.selenium.By;

import utility.Commonfunction;

public class Employeelist extends Commonfunction
{	
public static void addemployee(String fn,String mn,String ln)
{
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.id("firstName")).sendKeys(fn);
	driver.findElement(By.id("middleName")).sendKeys(mn);
	driver.findElement(By.id("lastName")).sendKeys(ln);
	driver.findElement(By.id("btnSave")).click();
}
public static void searchemployee(String searchname)
{
	driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Mythily");
	driver.findElement(By.id("searchBtn")).click();	
}
public static void deleteemployee() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectAll']")).click();
	driver.findElement(By.id("btnDelete")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("dialogDeleteBtn")).click();
}
}
