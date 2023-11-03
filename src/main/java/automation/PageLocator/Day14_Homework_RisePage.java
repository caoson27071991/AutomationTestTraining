package automation.PageLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Day14_Homework_RisePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[text()='Sign up']")
    private WebElement SignUp;
    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement FirstName;
    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement LastName;
    @FindBy(xpath = "//input[@id='type_organization']")
    private WebElement Organization;
    @FindBy(xpath = "//input[@id='company_name']")
    private WebElement Companyname;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement Email;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement Passwork;
    @FindBy(xpath = "//input[@id='retype_password']")
    private WebElement RetypePasswork;
    @FindBy(xpath = "//button[text()='Sign up']")
    private WebElement SignUp1;

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
    @FindBy(xpath = "//a[contains(text(),'Change Password')]//parent::li")
    private WebElement ChangePassword;
    @FindBy(xpath = "//div[@class='card-footer rounded-0']/button[text()=' Save']")
    private WebElement Save;
    @FindBy(xpath = "//a[text()=' Sign Out']//parent::li")
    private WebElement SignOut;


    public Day14_Homework_RisePage(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }
    public void SignUpFunction(String firstname, String lastname, String companyname, String email, String passwork){
        SignUp.click();
        FirstName.clear();
        FirstName.sendKeys(firstname);
        LastName.clear();
        LastName.sendKeys(lastname);
        if (Organization.isSelected()==false){
            Organization.click();
        }
        Companyname.clear();
        Companyname.sendKeys(companyname);
        Email.clear();
        Email.sendKeys(email);
        Passwork.clear();
        Passwork.sendKeys(passwork);
        RetypePasswork.clear();
        RetypePasswork.sendKeys(passwork);
        SignUp1.click();
    }
    public void LoginFunction(String email,String password){
        Email.clear();
        Email.sendKeys(email);
        Passwork.clear();
        Passwork.sendKeys(password);
        Signin.click();
    }
    public void ChangePassword(String newpasswork){
        DropAvata.click();
        ChangePassword.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Passwork.clear();
        Passwork.sendKeys(newpasswork);
        RetypePasswork.clear();
        RetypePasswork.sendKeys(newpasswork);
        Save.click();

    }
}
