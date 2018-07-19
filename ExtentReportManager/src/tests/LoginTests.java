package tests;

import org.testng.annotations.Test;

import com.ExtentReports.ExtentTestManager;

import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest  {// Extra information:
// 1) @BeforeClass we declared driver and wait variables
// 2) We send these driver and wait variables to the page class with below declaration
//    Homepage homepage = new HomePage(driver,wait);
// 3) super () method in page class transfer the driver and wait variables values to the BasePage class.

@Test (priority = 0, description="Invalid Login Scenario with empty username")
public void invalidLoginTest_EmptyUserName () throws InterruptedException {
    //ExtentReports Description
   // ExtentTestManager.getTest().setDescription("Invalid Login Scenario with wrong username and password.");
	ExtentTestManager.startTest("ABC", "ANC");
	
	ExtentTestManager.getTest().getEndedTime();
    //*************PAGE INSTANTIATIONS*************
    HomePage homePage = new HomePage(driver,wait);
    LoginPage loginPage = new LoginPage(driver,wait);

    //*************PAGE METHODS********************
    //Open N11 HomePage
    homePage.goToN11(driver);
   //Go to LoginPage
    homePage.goToLoginPage();
    loginPage.loginUsername("");
    homePage.goToLoginPage();
  

    //*************ASSERTIONS***********************
    Thread.sleep(500);
    loginPage.verifyLoginBlank("Enter an email or phone number");
   
}

@Test (priority = 1, description="Invalid Login Scenario with invalid username")
public void invalidLoginTest_InvalidUserEmptyPassword () throws InterruptedException {
    //ExtentReports Description
   ExtentTestManager.getTest().setDescription("Invalid Login with invalid username");
   ExtentTestManager.getTest().getEndedTime();
   
    //*************PAGE INSTANTIATIONS*************
    HomePage homePage = new HomePage(driver,wait);
    LoginPage loginPage = new LoginPage(driver,wait);

    //*************PAGE METHODS********************
   // homePage.goToN11(driver);
   loginPage.loginUsername("!@#ASDA");
   homePage.goToLoginPage();
   //loginPage.loginPassword("");
  // homePage.goToLoginPage();
    //*************ASSERTIONS***********************
    Thread.sleep(500);
    loginPage.verifyLoginUserName("Enter a valid email or phone number");
    loginPage.loginClear();
    Thread.sleep(1000);
   // loginPage.verifyLoginUserName("Enter a valid email or phone number");
   // loginPage.verifyLoginPassword("WRONG MESSAGE FOR FAILURE!");

}


@Test (priority = 1, description="Invalid Login Scenario with Valid username")
public void invalidLoginTest_ValidUserPassword () throws InterruptedException {
    //ExtentReports Description
   ExtentTestManager.getTest().setDescription("Invalid Login with Valid username");
   ExtentTestManager.getTest().getEndedTime();
   
    //*************PAGE INSTANTIATIONS*************
    HomePage homePage = new HomePage(driver,wait);
    LoginPage loginPage = new LoginPage(driver,wait);

    //*************PAGE METHODS********************
   // homePage.goToN11(driver);
   
   loginPage.loginUsername("shivanandpadiyar2");
   homePage.goToLoginPage();
   loginPage.loginPassword("Shivpad13!");
   homePage.goToLoginPage();
   
   //loginPage.loginPassword("");
  // homePage.goToLoginPage();
    //*************ASSERTIONS***********************
    Thread.sleep(500);
   System.out.println("Test Pass");
   // loginPage.verifyLoginUserName("Enter a valid email or phone number");
   // loginPage.verifyLoginPassword("WRONG MESSAGE FOR FAILURE!");

}
}
