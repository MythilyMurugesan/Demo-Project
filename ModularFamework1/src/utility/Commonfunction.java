package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Commonfunction {
public static WebDriver driver;
	public static void browseropen(String bname)
	{
		switch(bname.toLowerCase())
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver","./Browser driver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
;			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",".src/Browser driver/geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		case "internet explorer":
			System.setProperty("webdriver.ie.driver",".src/Browser driver/ie.exe");
			driver=new InternetExplorerDriver();
			break;
			
		}
		
	}
	
	public static void applaunch(String url)
	{
		driver.get(url);	
		
	}
    public static void browserclose()
    {
     driver.quit();
    }


}