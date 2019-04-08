package pages;

import org.openqa.selenium.By;

import utility.Commonfunction;

public class Loginpages extends Commonfunction {
	public static void login(String un,String pw)
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}


}

