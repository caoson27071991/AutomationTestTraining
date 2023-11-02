package automation.HomeWork;


import automation.common.CommonBase;
import automation.constant.Accoun;
import automation.constant.Locator;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Day13_HomeWork extends CommonBase {
    @BeforeMethod
    public void OpenChromDriver() {
        driver = initChromeDriver(Locator.webURL);
    }

    @Test (priority = 1)
    public void LoginSuccessfully() {
        WebElement txtemail = driver.findElement(Locator.Email);
        if (txtemail.isDisplayed()) {
            txtemail.clear();
            txtemail.sendKeys(Accoun.Emailtrue);
        }
        WebElement txtpass = driver.findElement(Locator.Password);
        if (txtpass.isDisplayed()) {
            txtpass.clear();
            txtpass.sendKeys(Accoun.Passtrue);
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement buttonSignin = driver.findElement(Locator.SignIn);
        if (buttonSignin.isDisplayed()) {
            buttonSignin.click();
        }
        assertEquals(true, driver.findElement(Locator.Dashboard).isDisplayed());
    }

    @Test (priority = 2)
    public void LoginFail_IncorrectEmail() {
        WebElement txtemail = driver.findElement(Locator.Email);
        if (txtemail.isDisplayed()) {
            txtemail.clear();
            txtemail.sendKeys(Accoun.Emailfalse);
        }
        WebElement txtpass = driver.findElement(Locator.Password);
        if (txtpass.isDisplayed()) {
            txtpass.clear();
            txtpass.sendKeys(Accoun.Passtrue);
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement buttonSignin = driver.findElement(Locator.SignIn);
        if (buttonSignin.isDisplayed()) {
            buttonSignin.click();
        }
        assertEquals(true, driver.findElement(Locator.Authenticationfailed).isDisplayed());
        assertEquals("Authentication failed!", driver.findElement(Locator.Authenticationfailed).getText());
    }

    @Test (priority = 3)
    public void LoginFail_IncorrectPassword() {
        WebElement txtemail = driver.findElement(Locator.Email);
        if (txtemail.isDisplayed()) {
            txtemail.clear();
            txtemail.sendKeys(Accoun.Emailtrue);
        }
        WebElement txtpass = driver.findElement(Locator.Password);
        if (txtpass.isDisplayed()) {
            txtpass.clear();
            txtpass.sendKeys(Accoun.Passfalse);
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement buttonSignin = driver.findElement(Locator.SignIn);
        if (buttonSignin.isDisplayed()) {
            buttonSignin.click();
        }
        assertEquals(true, driver.findElement(Locator.Authenticationfailed).isDisplayed());
        assertEquals("Authentication failed!", driver.findElement(Locator.Authenticationfailed).getText());
    }

    @Test (priority = 4)
    public void LoginFail_IncorrectEmailPassword() {
        WebElement txtemail = driver.findElement(Locator.Email);
        if (txtemail.isDisplayed()) {
            txtemail.clear();
            txtemail.sendKeys(Accoun.Emailfalse);
        }
        WebElement txtpass = driver.findElement(Locator.Password);
        if (txtpass.isDisplayed()) {
            txtpass.clear();
            txtpass.sendKeys(Accoun.Passfalse);
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement buttonSignin = driver.findElement(Locator.SignIn);
        if (buttonSignin.isDisplayed()) {
            buttonSignin.click();
        }
        assertEquals(true, driver.findElement(Locator.Authenticationfailed).isDisplayed());
        assertEquals("Authentication failed!", driver.findElement(Locator.Authenticationfailed).getText());
    }

    @Test (priority = 5)
    public void LogoutSuccessfully() {
        WebElement txtemail = driver.findElement(Locator.Email);
        if (txtemail.isDisplayed()) {
            txtemail.clear();
            txtemail.sendKeys(Accoun.Emailtrue);
        }
        WebElement txtpass = driver.findElement(Locator.Password);
        if (txtpass.isDisplayed()) {
            txtpass.clear();
            txtpass.sendKeys(Accoun.Passtrue);
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement buttonSignin = driver.findElement(Locator.SignIn);
        if (buttonSignin.isDisplayed()) {
            buttonSignin.click();
        }
        assertEquals(true, driver.findElement(Locator.Dashboard).isDisplayed());
        WebElement dropdownAvata = driver.findElement(Locator.MyAvata);
        if (dropdownAvata.isDisplayed()){
            dropdownAvata.click();
        }
        pause(2000);
        WebElement Signout = driver.findElement(Locator.SignOut);
        if (Signout.isDisplayed()){
            Signout.click();
        }
        pause(2000);
        assertEquals(true,driver.findElement(Locator.SignIn).isDisplayed());
    }
    @AfterMethod
    public void closeBrowserTest() {
        quitDriver(driver);
    }
}
