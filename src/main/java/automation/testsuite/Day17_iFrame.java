package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_LocatorAlada;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day17_iFrame extends CommonBase {
    @BeforeMethod
    public void OpenChrome() {

        driver = initChromeDriver(CT_LocatorAlada.webAladaURL);
    }

    @Test
    public void iFrame() {
        pause(15000);
        int totalFarm = driver.findElements(By.tagName("iframe")).size();
        System.out.println(totalFarm);
        for (int i = 0; i < totalFarm; i++) {
            driver.switchTo().frame(i);
            int daTimThayElement = driver.findElements(By.xpath("//span[text()='Bắt đầu chat']")).size();
            System.out.println("Đã tìm thấy Element : " + daTimThayElement);
            driver.switchTo().defaultContent();
        }

    }

    @AfterMethod
    public void CloseChrome() {
        quitDriver(driver);

    }
}



