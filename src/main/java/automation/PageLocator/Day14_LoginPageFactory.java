package automation.PageLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_LoginPageFactory {
    private WebDriver driver;

    @FindBy(id = "email")
    private WebElement txtEmail;
    @FindBy(id = "password")
    private WebElement txtPass;
    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement Signin;
    @FindBy(xpath = "//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']")
    private WebElement Dashboard;
    @FindBy(xpath = "//a[@id='user-dropdown']//parent::li")
    private WebElement DropAvata;
    @FindBy(xpath = "//a[text()=' Sign Out']//parent::li")
    private WebElement SignOut;
    public Day14_LoginPageFactory(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }
    public void LoginFunction(String email,String password){
        txtEmail.clear();
        txtEmail.sendKeys(email);
        txtPass.clear();
        txtPass.sendKeys(password);
        Signin.click();
    }
    public void LogoutFunction(){
            DropAvata.click();
            SignOut.click();
        }
    }

