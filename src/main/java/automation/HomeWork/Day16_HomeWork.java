package automation.HomeWork;

import automation.common.CommonBase;
import automation.constant.Accoun;
import automation.constant.CT_LocatorAlada;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Day16_HomeWork extends CommonBase {
    @BeforeMethod
    public void OpenChrome(){

        driver = initChromeDriver(CT_LocatorAlada.webAladaURL);
    }
    @Test
    public void AlertAlada(){
        click(CT_LocatorAlada.Dangnhap);
        type(CT_LocatorAlada.LoginEmail, Accoun.EmailAlada);
        type(CT_LocatorAlada.LoginPassword,Accoun.PassAlada);
        click(CT_LocatorAlada.ButtonDangnhap);
        click(CT_LocatorAlada.Avata);
        click(CT_LocatorAlada.Chinhsuathongtin);
        scrollToElement(CT_LocatorAlada.OldPassword);
        type(CT_LocatorAlada.OldPassword,Accoun.PassAlada);
        type(CT_LocatorAlada.NewPassword,Accoun.Passnew);
        type(CT_LocatorAlada.ReNewpassword,Accoun.Passnew);
        click(CT_LocatorAlada.ButtonLuumatkhau);
        pause(2000);
        driver.switchTo().alert().accept();
        scrollToElement(CT_LocatorAlada.Thongtinkhoahoc);
        assertEquals(true,driver.findElement(CT_LocatorAlada.Thongtinkhoahoc).isDisplayed());



    }
    @AfterMethod
    public void CloseChrome(){
        quitDriver(driver);
    }
}

//    type(CT_LocatorAlada.OldPassword,Accoun.Passnew);
//    type(CT_LocatorAlada.NewPassword,Accoun.PassAlada);
//    type(CT_LocatorAlada.ReNewpassword,Accoun.PassAlada);
//    click(CT_LocatorAlada.ButtonLuumatkhau);
//    pause(2000);
//        driver.switchTo().alert().accept();
