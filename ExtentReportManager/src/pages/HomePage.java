package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class HomePage extends BasePage {
 
    //*********Constructor*********
    public HomePage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
 
    //*********Page Variables*********
    String baseURL = "http://mail.google.com/";
 
    //*********Web Elements*********
    //String signInButtonClass = "RveJvd snByac";
    String nextSignIn = "//span[text()='Next']";
 
 
    //*********Page Methods*********
 
    //Go to Homepage
    public void goToN11 (WebDriver driver){
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.navigate().to(baseURL)
    }
 
    //Go to LoginPage
    public void goToLoginPage (){
        click(By.xpath(nextSignIn));
    }
}