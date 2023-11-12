package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_LocatorRise;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Day16_AlertPractice extends CommonBase {
    @BeforeMethod
    public void OpenChrome(){
        driver = initChromeDriver(CT_LocatorRise.webURL3);
    }
    @Test
    public void DeleteCustomer(){
        type(By.xpath("//input[@name='cusid']"),"id123");
        click(By.xpath("//input[@name='submit']"));
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
        assertEquals(driver.getTitle(),"Delete Customer");
        assertTrue(isElementPresent(By.xpath("//h2[text()='Guru99 Bank']")));
    }
    @Test
    public void DemoAlert(){
        driver.navigate().to(CT_LocatorRise.webURL4);
        click(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
        click(By.xpath("//button[normalize-space()='click the button to display a confirm box']"));
        driver.switchTo().alert().dismiss();
        assertTrue(isElementPresent(By.xpath("//p[normalize-space()='You Pressed Cancel']")));
        click(By.xpath("//a[normalize-space()='Alert with Textbox']"));
        click(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']"));
        driver.switchTo().alert().sendKeys("Cao Son");
        driver.switchTo().alert().accept();
        assertTrue(isElementPresent(By.xpath("//p[normalize-space()='Hello Cao Son How are you today']")));
    }
    @AfterMethod
    public void CloseChrome(){
        quitDriver(driver);
    }
}
