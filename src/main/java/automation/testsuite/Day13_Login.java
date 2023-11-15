package automation.testsuite;

import automation.PageLocator.Day13_LoginPage;
import automation.common.CommonBase1;
import automation.constant.CT_LocatorRise;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Day13_Login extends CommonBase1 {
    @BeforeMethod
    public void openSystemUnderTest() {
        driver = initChromeDriver(CT_LocatorRise.webURLRise);
    }
    @Test (priority = 1)
    public void LoginSuccessfully() {
       Day13_LoginPage login = new Day13_LoginPage(driver);
       login.LoginFunction("admin@demo.com","riseDemo");
        assertEquals(true,driver.findElement(CT_LocatorRise.Dashboard).isDisplayed());
    }
    @Test (priority = 2)
    public void LoginFail_IncorrectEmail() {
        Day13_LoginPage login = new Day13_LoginPage(driver);
        login.LoginFunction("admin@demo1.com","riseDemo");
        assertEquals(true,driver.findElement(CT_LocatorRise.Authenticationfailed).isDisplayed());
    }
    @Test (priority = 3)
    public void LoginFail_IncorrectPass() {
        Day13_LoginPage login = new Day13_LoginPage(driver);
        login.LoginFunction("admin@demo.com","riseDemo1");
        assertEquals(true,driver.findElement(CT_LocatorRise.Authenticationfailed).isDisplayed());
    }

    @AfterMethod
    public void closeBrowserTest() {
        quitDriver(driver);
    }
}

