package org.magnitia.selenium.gcreddy.appModule;

import org.magnitia.selenium.gcreddy.Reports.Log;
import org.magnitia.selenium.gcreddy.Reports.Reports;
import org.magnitia.selenium.gcreddy.appModule.LaunchEnv1;
import org.magnitia.selenium.gcreddy.appModule.LoginActions;
import org.magnitia.selenium.gcreddy.utilities.ExcelUtils;
import org.magnitia.selenium.gcreddy.utilities.Utilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginActions_PositiveData extends Utilities {
	
	@BeforeMethod
	public  void preCondition() {
		Log.startTest("Logian actions_TC operations validation");
		Reports.startTEST("Login Actions_TC", "Login actions test case operation validation");	
	Assert.assertTrue(	LaunchEnv1.BrowserInvocation(prop_config.getProperty("Browser_config"))  );
	Assert.assertTrue(  LaunchEnv1.invokeUrl(prop_config.getProperty("Uibank_url")) );
	driver.manage().window().maximize();
	Utilities.waitImplicit();
	}
	
	// how many rows are there _-. that many times will execute.
			// how many columns are there that many parameters must be declared.... and parameters values will be
			//   be Parametarized to sequence of variables
			//  Object[5][7] 
			// @Data provider will execute by default no of rows in Object[][] for no of columns data.
	
	@Test
	public static void loginActionsTC() {		
		
	    Assert.assertTrue(	LoginActions.loginActions_positiveData(prop_config.getProperty("Login_username"), prop_config.getProperty("Login_password"))  );		
	    Log.info("Login actions completed successfuly");
	    Reports.info("Login Actions", "Login Acitons completed successfully");
	}
	
		
	
	
	
	
	 
 
}
