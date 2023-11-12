package automation.HomeWork;

import automation.PageLocator.Day14_Homework_RisePage;
import automation.common.CommonBase1;
import automation.constant.CT_LocatorRise;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Day14_HomeWork_SignUpRise extends CommonBase1 {
    @BeforeMethod
    public void OpenChromeDriver(){
        driver = initChromeDriver(CT_LocatorRise.webURL);
    }
    @Test(priority = 1)
    public void SignUpSuccessfully() {
        Day14_Homework_RisePage signup = new Day14_Homework_RisePage(driver);
        signup.SignUpFunction("Cao","Son","CaoSon835","caoson001@gmail.com","Caoson1!");
        pause(2000);
        assertEquals(true,driver.findElement(CT_LocatorRise.Successfully).isDisplayed());
    }
    @Test (priority = 2)
    public void ChangePassword() {
        Day14_Homework_RisePage login = new Day14_Homework_RisePage(driver);
        login.LoginFunction("caoson001@gmail.com","Caoson1!");
        pause(2000);
        assertEquals(true,driver.findElement(CT_LocatorRise.Dashboard).isDisplayed());
        login.ChangePassword("Caoson2!");
        pause(2000);
        assertEquals(true,driver.findElement(CT_LocatorRise.Therecord).isDisplayed());
    }
    @Test (priority = 3)
    public void SignInWithChangePassword() {
        Day14_Homework_RisePage login = new Day14_Homework_RisePage(driver);
        login.LoginFunction("caoson001@gmail.com", "Caoson2!");
        pause(2000);
        assertEquals(true, driver.findElement(CT_LocatorRise.Dashboard).isDisplayed());
    }

    @AfterMethod
    public void CloseChromeDriver(){
        quitDriver(driver);
    }
}
