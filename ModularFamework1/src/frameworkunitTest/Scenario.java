package frameworkunitTest;

import pages.Employeelist;
import pages.Homepages;
import pages.Loginpages;
import utility.Commonfunction;

public class Scenario {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//add employee
		Commonfunction.browseropen("chrome");
		Commonfunction.applaunch("https://opensource-demo.orangehrmlive.com/");
		Loginpages.login("Admin", "admin123");
		Homepages.navigateToPIM();
		Employeelist.addemployee("Mythily", "Amutha", "Murugesan");
		Homepages.logout();
        Commonfunction.browserclose();        
        
  //search employee
        Commonfunction.browseropen("chrome");
		Commonfunction.applaunch("https://opensource-demo.orangehrmlive.com/");
		Loginpages.login("Admin", "admin123");
		Homepages.navigateToPIM();
		Employeelist.searchemployee("Mythily");
	    Homepages.logout();
        Commonfunction.browserclose();
    
   //Delete Employee
        Commonfunction.browseropen("chrome");
        Commonfunction.applaunch("https://opensource-demo.orangehrmlive.com/");
        Loginpages.login("Admin" , "admin123");
        Homepages.navigateToPIM();
        Employeelist.searchemployee("Mythily");
        Thread.sleep(2000);
        Employeelist.deleteemployee();
        Homepages.logout();
        Commonfunction.browserclose();
	
	}
	

}
