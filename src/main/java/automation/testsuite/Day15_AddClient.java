package automation.testsuite;

import automation.PageLocator.Day14_LoginPageFactory;
import automation.PageLocator.Day15_ClientPageFactory;
import automation.common.CommonBase1;
import automation.constant.Accoun;
import automation.constant.CT_LocatorRise;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Day15_AddClient extends CommonBase1 {
    @BeforeMethod
    public void OpenChrome(){
        driver = initChromeDriver("https://rise.fairsketch.com/signin?redirect=https://rise.fairsketch.com/events");
    }
    @Test
    public void AddClientSuccessfully() throws InterruptedException {
        Day14_LoginPageFactory page = new Day14_LoginPageFactory(driver);
        page.LoginFunction(Accoun.Emailtrue,Accoun.Passtrue);
        assertEquals(true,driver.findElement(CT_LocatorRise.Dashboard).isDisplayed());
        Day15_ClientPageFactory client = new Day15_ClientPageFactory(driver);
        client.AddnewClientFunction("Company04");
        assertEquals(true,driver.findElement(By.xpath("//a[text()='Company04']")).isDisplayed());
    }
    @AfterMethod
    public void CloseChrome(){
        quitDriver(driver);
    }
}
