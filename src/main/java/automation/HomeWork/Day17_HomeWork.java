package automation.HomeWork;

import automation.common.CommonBase;
import automation.constant.CT_LocatorRise;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class Day17_HomeWork extends CommonBase {
    @BeforeMethod
    public void OpenChrome(){
        driver = initChromeDriver(CT_LocatorRise.webCodestar);
    }
    @Test
    public void iFrameIdex(){
        pause(20000);
        int totaliFrame = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Số lượng iFrameIdex : " +totaliFrame);
        for (int i = 0; i<totaliFrame; i++) {
            driver.switchTo().frame(i);
            int elementBatdauchat = driver.findElements(By.xpath("//span[contains(text(),'Bắt đầu chat')]")).size();
            if (elementBatdauchat == 1) {
                System.out.println("Đã tìm thấy Element Bắt đầu chát trong IframeIdex ở vị trí thứ :" + i);
            }
            int elementGuingay = driver.findElements(By.xpath("//button[contains(text(),'Gửi ngay')]")).size();
            if (elementGuingay == 1) {
                System.out.println("Đã tìm thấy Element Gửi ngay trong IframeIdex ở vị trí thứ :" + i);
            }
            driver.switchTo().defaultContent();
        }
    }
    @Test
    public void iFrame_Bai1(){
        pause(15000);
        driver.switchTo().frame(5);
        click(By.xpath("//span[contains(text(),'Bắt đầu chat')]"));
        click(By.xpath("//span[contains(text(),'Sử dụng Messenger')]"));
        String mainWindow = driver.getWindowHandle();
        System.out.println("Main Window is :" +mainWindow);
        Set<String> listSubWindows = driver.getWindowHandles();
        for (String subwindow : listSubWindows){
            System.out.println("Subwindow is :"+subwindow);
            if (!subwindow.equals(mainWindow))
            {
                driver.switchTo().window(subwindow);
                pause(3000);
                assertEquals(true,driver.findElement(By.xpath("//div[text()='Chat with CodeStar Academy']")).isDisplayed());
                type(By.xpath("//input[@id='email']"),"Admin01@gmail.com");
                pause(2000);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
    }
    @Test
    public void iFrame_Bai2(){
        pause(15000);
        driver.switchTo().frame(1);
        type(By.xpath("//button[text()='Gửi ngay']//parent::div//preceding-sibling::div//input[@id='account_phone']"),"123456789");
        pause(2000);
        click(By.xpath("//button[text()='Gửi ngay']"));
        driver.switchTo().parentFrame();
        assertEquals(true,driver.findElement(By.xpath("//h2[contains(text(),'Đăng kí nhận tư vấn lộ trình phát triển nghề nghiệp')]")).isDisplayed());
    }
    @AfterMethod
    public void CloseChrome(){
        quitDriver(driver);
    }

}
