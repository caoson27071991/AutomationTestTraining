package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_LocatorRise;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Day17_CodestarIframe extends CommonBase {
    @BeforeMethod
    public void OpenChrome() {

        driver = initChromeDriver(CT_LocatorRise.webCodestar);
    }
    @Test
    public void iFrame() {
        pause(10000);
        int totalFrame = driver.findElements(By.tagName("iframe")).size();
        for (int i = 0; i < totalFrame; i++) {
            driver.switchTo().frame(i);
            int daTimThayElement = driver.findElements(By.xpath("//button[text()='Đăng ký ngay']")).size();
            System.out.println("Đã tìm thấy Element : " + daTimThayElement);
            driver.switchTo().defaultContent();
        }
    }
    @Test
    public void handleIframe(){
        pause(5000);
        scrollToElement(By.xpath("//h2[contains(text(),'Đăng ký nhận tài liệu:')]"));
        driver.switchTo().frame(3);
        type(By.xpath("//input[@name='account_name']"),"Cao Sơn");
        click(By.xpath("//button[text()='Đăng ký ngay']"));
        assertTrue(isElementPresent(By.xpath("//button[text()='Đăng ký ngay']")));
    }
    @AfterMethod
    public void CloseChrome(){
        quitDriver(driver);
    }

}

