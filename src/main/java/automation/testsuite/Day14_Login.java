package automation.testsuite;

import automation.PageLocator.Day14_LoginPageFactory;
import automation.common.CommonBase;
import automation.constant.Accoun;
import automation.constant.Locator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Day14_Login extends CommonBase {
    @BeforeMethod
    public void OpenChrome() {

        driver = initChromeDriver(Locator.webURL);
}
    @Test(priority = 1)
    public void LoginSuccessfully() {
        Day14_LoginPageFactory page = new Day14_LoginPageFactory(driver);
        page.LoginFunction(Accoun.Emailtrue,Accoun.Passtrue);
        assertEquals(true,driver.findElement(Locator.Dashboard).isDisplayed());
    }
    @Test(priority = 2)
    public void LoginFail_IncorrectEmail() {
        Day14_LoginPageFactory page = new Day14_LoginPageFactory(driver);
        page.LoginFunction(Accoun.Emailfalse,Accoun.Passtrue);
        assertEquals(true,driver.findElement(Locator.Authenticationfailed).isDisplayed());
    }
    @Test(priority = 3)
    public void LoginFail_IncorrectPass() {
        Day14_LoginPageFactory page = new Day14_LoginPageFactory(driver);
        page.LoginFunction(Accoun.Emailtrue,Accoun.Passfalse);
        assertEquals(true,driver.findElement(Locator.Authenticationfailed).isDisplayed());
    }
    @Test(priority = 4)
    public void LoginFail_IncorrectEmailPass() {
        Day14_LoginPageFactory page = new Day14_LoginPageFactory(driver);
        page.LoginFunction(Accoun.Emailfalse,Accoun.Passfalse);
        assertEquals(true,driver.findElement(Locator.Authenticationfailed).isDisplayed());
    }
    @Test(priority = 5)
    public void LogoutSuccessfully() {
        Day14_LoginPageFactory page = new Day14_LoginPageFactory(driver);
        page.LoginFunction(Accoun.Emailtrue,Accoun.Passtrue);
        assertEquals(true,driver.findElement(Locator.Dashboard).isDisplayed());
        page.LogoutFunction();
        assertEquals(true,driver.findElement(Locator.SignIn).isDisplayed());

    }
    @AfterMethod
    public void closeBrowserTest() {
        quitDriver(driver);
    }
}
