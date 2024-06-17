package org.magnitia.selenium.gcreddy.appModule;


import org.magnitia.selenium.gcreddy.BaseClass.BaseClass;
import org.magnitia.selenium.gcreddy.Reports.Log;
import org.magnitia.selenium.gcreddy.Reports.Reports;
import org.magnitia.selenium.gcreddy.constants.Constant;
import org.magnitia.selenium.gcreddy.utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LaunchEnv1 extends BaseClass {
	public static boolean flag;
	public static WebDriver driver;

	public static boolean BrowserInvocation(String Browser) {
			 flag = false;
			
			try {
			 if(Browser.equalsIgnoreCase("chrome")) {
				 System.setProperty("webdriver.chrome.driver", Constant.chromepath);
				 driver = new ChromeDriver();
				 driver.manage().window().maximize();
				 Utilities.waitImplicit();	
				 flag=true;
				 Log.info(Browser +"invoked successfully");
			//	 Reports.pass("Browser Invocaiton", Browser+ "invoked successfully");
			 }else if(Browser.equalsIgnoreCase("Firefox")) {
				 System.setProperty("webdriver.gecko.driver", "");
				 driver = new FirefoxDriver();
				 flag=true;
				 }else {
					 Log.info("Provided browser is invalid");
				 }			
		}catch(Exception e) {
			Log.info(Browser +" failed to invoke due to "+ e.fillInStackTrace());
			Reports.fail("Browser Invocation", Browser + "invocation failed due to "+e.toString(), "");				
		}	

	return flag;
}
//---------------------------------------------------------------------------------------------------	
	public static  boolean  invokeUrl(String Url) {
		flag= false;
	//	System.out.println(" Present applicaiton url is "+ Url);
		try {
			driver.get(Url);
			flag=true;
			 Log.info(Url +"invoked successfully");
			// Reports.pass("Appliation Invocaiton", Url+ "invoked successfully");
		}catch(Exception e) {
			Log.info(Url +" failed to invoke due to "+ e.fillInStackTrace());
			Reports.fail("Applicaoitn  Invocation", Url + "invocation failed due to "+e.toString(), "");		
		}		
		return flag;		
	}
	
	//-----------------------------------------------------------------------------------------------
	public static void closeBrowser() {
		try {
			driver.close();
			 Log.info("Browser closed successfully");
			 Reports.info("Broser clowing ","Browser closed successfully");
		}catch(Exception e) {
			Log.info( "Broser closkng is  failed due to "+ e.fillInStackTrace());
			Reports.fail("Browser closing", "Browser closing failed due to "+e.toString(), "");
		}
	}
//---------------------------------------------------------------------------------------------------	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
