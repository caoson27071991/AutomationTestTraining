package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_LocatorRise;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class Day_17PopupWindow extends CommonBase {
        @BeforeMethod
        public void OpenChrome(){
            driver = initChromeDriver(CT_LocatorRise.webPupupURL);
        }
        @Test
        public void VeriFyNewTab(){
            click(By.xpath("//a[contains(text(),'Click Here')]"));
            String mainWindow = driver.getWindowHandle();
            System.out.println("Main Window is :" +mainWindow);
            Set<String> listSubWindows = driver.getWindowHandles();
            for (String subwindow : listSubWindows){
                System.out.println("Subwindow is :"+subwindow);
                if (!subwindow.equals(mainWindow))
                {
                    driver.switchTo().window(subwindow);
                    assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com/articles_popup.php");
                    type(By.xpath("//input[@name='emailid']"),"Admin123@gmail.com");
                    click(By.xpath("//input[@name='btnLogin']"));
                    driver.close();
                }
            }
            driver.switchTo().window(mainWindow);
            System.out.println("Main window's title is :"+driver.getCurrentUrl());
            assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com//popup.php");
        }
    }


