package pages;

import org.openqa.selenium.By;

import utility.Commonfunction;

public class Homepages extends Commonfunction {
public static void navigateToPIM()
{
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
}
public static void logout() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.id("welcome")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Logout")).click();
}
}
