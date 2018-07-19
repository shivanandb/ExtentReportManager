package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
public class LoginPage extends BasePage{
 
    //*********Constructor*********
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
 
    //*********Web Elements*********
    String usenameId = "//input[@type='email']";
    String passwordId = "password";
    String loginButtonId = "span[text()='Next']";
    
    String errorMessageUsernameXpath = "//div[text()='Enter a valid email or phone number']";
    String errorMessagePasswordXpath = "//div[text()='Wrong password. Try again or click Forgot password to reset it.']";
    String emptyLogin = "//div[text()='Enter an email or phone number']";
    //*********Page Methods*********
 
    public void loginPassword (String password){
        
        //Enter Password
        writeText(By.name(passwordId), password);
        //Click Login Button
     //   click(By.xpath(loginButtonId));
    }
    public void loginUsername (String username){
        //Enter Username(Email)
        writeText(By.xpath(usenameId),username);
    }
    
    //Verify Username Condition
    public void verifyLoginUserName (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessageUsernameXpath)), expectedText);
    }
 public void loginClear(){
	 driver.findElement(By.xpath(usenameId)).clear();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
    //Verify Password Condition
    public void verifyLoginPassword (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath)), expectedText);
    }
    public void verifyLoginBlank (String expectedText) {
        Assert.assertEquals(readText(By.xpath(emptyLogin)), expectedText);
    }
  
 
}