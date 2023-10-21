package automation.testsuite;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class Day8_LocatorPractice extends CommonBase {
    @BeforeMethod
    public void initChromeWebDriver(){
        initChromeDriver("https://rise.fairsketch.com/signin");
    }
    @Test (priority = 1)
    public void findlocatorById() {
        WebElement email = driver.findElement(By.id("email"));
        System.out.println("Email locator :" + email);
        WebElement password = driver.findElement(By.id("password"));
        System.out.println("Password locator :" + password);
        WebElement signin = driver.findElement(By.tagName("button"));
        System.out.println("Signin locator :" + signin);
    }
    @Test (priority = 2)
    public void findlocatorByLinktext() {
        driver.navigate().to("https://bepantoan.vn/danh-muc/may-hut-mui");
        WebElement textmhmAmtu = driver.findElement(By.linkText("Máy Hút Mùi Âm Tủ"));
        System.out.println("Linktext Máy hút mùi âm tủ : "+textmhmAmtu);
        WebElement textmhmCodien = driver.findElement(By.partialLinkText("Cổ Điển"));
        System.out.println("Linktext Máy hút mùi âm tủ : "+textmhmCodien);
//
//
    }
}
