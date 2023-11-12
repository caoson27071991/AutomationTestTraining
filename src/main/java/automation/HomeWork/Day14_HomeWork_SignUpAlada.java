package automation.HomeWork;

import automation.PageLocator.Day14_HomeWork_AladaPage;
import automation.common.CommonBase1;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;



public class Day14_HomeWork_SignUpAlada extends CommonBase1 {
    @BeforeMethod
    public void OpenChromeDriver(){

        driver = initChromeDriver("https://alada.vn/");
    }
    @Test(priority = 1)
    public void SignUpSuccessfully(){
        Day14_HomeWork_AladaPage signup = new Day14_HomeWork_AladaPage(driver);
        signup.SignUpFunction("Cao Son","Caoson402@gmail.com", "Caoson1!","0968686868");
        pause(2000);
        assertEquals(true,driver.findElement(By.xpath("//div[@class='avatar2']")).isDisplayed());
    }
    @Test(priority = 2)
    public void ChangePasswordSuccessfully() throws InterruptedException {
        Day14_HomeWork_AladaPage changepass = new Day14_HomeWork_AladaPage(driver);
        changepass.ChangePassword("Caoson401@gmail.com","Caoson1!","Caoson2!");
    }
    @Test(priority = 3)
    public void LoginWithNewPassword(){
        Day14_HomeWork_AladaPage login = new Day14_HomeWork_AladaPage(driver);
        login.LoginNewPassword("Caoson401@gmail.com","Caoson2!");
        pause(2000);
        assertEquals(true,driver.findElement(By.xpath("//a[text()='Khóa học của tôi' and @class='fleft martop20 khct']")).isDisplayed());
    }
    @AfterMethod
    public void CloseChromeDriver(){
        quitDriver(driver);
    }
}
