package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(name="user-name")
    WebElement username;
    
    @FindBy(name="password")
    WebElement password;
    
    @FindBy(xpath="//input[@value='Login']")
    WebElement loginButton;
    
    public void enterUsername(String uname) {
        username.sendKeys(uname);
    }
    
    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }
    
    public void clickLogin() {
        loginButton.click();
    }

}
