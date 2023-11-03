package automation.testsuite;

import automation.PageLocator.Day13_LoginPage;
import automation.common.CommonBase;
import automation.constant.Accoun;
import automation.constant.Locator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Day13_Login extends CommonBase{
    @BeforeMethod
    public void openSystemUnderTest() {
        driver = initChromeDriver(Locator.webURL);
    }
    @Test (priority = 1)
    public void LoginSuccessfully() {
       Day13_LoginPage login = new Day13_LoginPage(driver);
       login.LoginFunction(Accoun.Emailtrue,Accoun.Passtrue);
        assertEquals(true,driver.findElement(Locator.Dashboard).isDisplayed());
    }
    @Test (priority = 2)
    public void LoginFail_IncorrectEmail() {
        Day13_LoginPage login = new Day13_LoginPage(driver);
        login.LoginFunction(Accoun.Emailfalse,Accoun.Passtrue);
        assertEquals(true,driver.findElement(Locator.Authenticationfailed).isDisplayed());
    }
    @Test (priority = 3)
    public void LoginFail_IncorrectPass() {
        Day13_LoginPage login = new Day13_LoginPage(driver);
        login.LoginFunction(Accoun.Emailtrue,Accoun.Passfalse);
        assertEquals(true,driver.findElement(Locator.Authenticationfailed).isDisplayed());
    }

    @AfterMethod
    public void closeBrowserTest() {
        quitDriver(driver);
    }
}

