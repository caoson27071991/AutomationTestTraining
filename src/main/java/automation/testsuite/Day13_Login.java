package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

public class Day13_Login extends CommonBase{
    @BeforeMethod
    public void openSystemUnderTest() {
        driver = initChromeDriver(Locator.webURL);
    }
    @Test (priority = 1)
    public void LoginSuccessfully() {
        WebElement txtemail = driver.findElement(Locator.Email);
        if (txtemail.isDisplayed()) {
            txtemail.clear();
            txtemail.sendKeys("admin@demo.com");
        }
        pause(3000);
        WebElement txtPass = driver.findElement(Locator.Password);
        if (txtPass.isDisplayed()) {
            txtPass.clear();
            txtPass.sendKeys("riseDemo");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement btnSignIn = driver.findElement(Locator.SignIn);
        if (btnSignIn.isDisplayed()){
            btnSignIn.click();
        }
        assertEquals(true,driver.findElement(By.xpath("//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']")).isDisplayed());
    }
    @Test (priority = 2)
    public void LoginFail_IncorrectEmail() {
        WebElement txtemail = driver.findElement(Locator.Email);
        if (txtemail.isDisplayed()) {
            txtemail.clear();
            txtemail.sendKeys("admin@demo1.com");
        }
        pause(3000);
        WebElement txtPass = driver.findElement(Locator.Password);
        if (txtPass.isDisplayed()) {
            txtPass.clear();
            txtPass.sendKeys("riseDemo");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement btnSignIn = driver.findElement(Locator.SignIn);
        if (btnSignIn.isDisplayed()){
            btnSignIn.click();
        }
        assertEquals(true,driver.findElement(By.xpath("//div[normalize-space()='Authentication failed!']")).isDisplayed());
//        System.out.println(driver.findElement(By.xpath("//div[normalize-space()='Authentication failed!']")).getText());
//        assertEquals("Authentication failed!",driver.findElement(By.xpath("//div[normalize-space()='Authentication failed!']")).getText());
    }
    @Test (priority = 3)
    public void LoginFail_IncorrectPass() {
        WebElement txtemail = driver.findElement(Locator.Email);
        if (txtemail.isDisplayed()) {
            txtemail.clear();
            txtemail.sendKeys("admin@demo.com");
        }
        pause(3000);
        WebElement txtPass = driver.findElement(Locator.Password);
        if (txtPass.isDisplayed()) {
            txtPass.clear();
            txtPass.sendKeys("riseDemo1");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement btnSignIn = driver.findElement(Locator.SignIn);
        if (btnSignIn.isDisplayed()){
            btnSignIn.click();
        }
        assertEquals(true,driver.findElement(By.xpath("//div[normalize-space()='Authentication failed!']")).isDisplayed());
    }

    @AfterMethod
    public void closeBrowserTest() {
        quitDriver(driver);
    }
}

