package automation.HomeWork;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class Day8_HomeWork_Bai1 extends CommonBase {
    @BeforeMethod
    public void initChromeWebDriver() {
        initChromeDriver("https://selectorshub.com/xpath-practice-page/");
    }

    @Test(priority = 1)
    public void testlocatorIdUserEmail() {
        pause(3000);
        driver.findElement(By.id("userId"));
        System.out.println("id UserEmail is Ok");
        driver.close();
    }
    @Test(priority = 2)
    public void testlocatorNameUserEmail() {
        pause(3000);
        driver.findElement(By.name("email"));
        System.out.println("name UserEmail is Ok");
        driver.close();
    }
    @Test(priority = 3)
    public void testlocatorClassNameUserEmail() {
        pause(3000);
        driver.findElement(By.className("selectors-input jsSelector"));
        System.out.println("className UserEmail is Ok");
        driver.close();
    }
    @Test(priority = 4)
    public void testlocatorTagNameUserEmail() {
        pause(3000);
        driver.findElement(By.tagName("input"));
        System.out.println("tagName UserEmail is Ok");
        driver.close();
    }

    @Test(priority = 5)
    public  void testlocarIdPassword(){
        pause(3000);
        driver.findElement(By.id("pass"));
        System.out.println("id Password is Ok");
        driver.close();
    }
    @Test(priority = 6)
    public  void testlocarNamePassword(){
        pause(3000);
        driver.findElement(By.name("Password"));
        System.out.println("name Password is Ok");
        driver.close();
    }
    @Test(priority = 7)
    public  void testlocarClassNamePassword(){
        pause(3000);
        driver.findElement(By.className("selectors-input jsSelector"));
        System.out.println("className Password is Ok");
        driver.close();
    }
    @Test(priority = 8)
    public  void testlocarTagNamePassword(){
        pause(3000);
        driver.findElement(By.tagName("input"));
        System.out.println("tagName Password is Ok");
        driver.close();
    }
    @Test(priority = 9)
    public  void testlocarNameCompany(){
        pause(3000);
        driver.findElement(By.name("company"));
        System.out.println("name Company is Ok");
        driver.close();
    }
    @Test(priority = 10)
    public  void testlocarClassNameCompany(){
        pause(3000);
        driver.findElement(By.className("form-control"));
        System.out.println("className Company is Ok");
        driver.close();
    }
    @Test(priority = 11)
    public  void testlocarTagNameCompany(){
        pause(3000);
        driver.findElement(By.tagName("input"));
        System.out.println("tagName Company is Ok");
        driver.close();
    }
    @Test(priority = 12)
    public  void testlocarNameMobileNumber(){
        pause(3000);
        driver.findElement(By.name("mobile number"));
        System.out.println("name MobileNumber is Ok");
        driver.close();
    }
    @Test(priority = 13)
    public  void testlocarClassNameMobileNumber(){
        pause(3000);
        driver.findElement(By.className("form-control"));
        System.out.println("className MobileNumber is Ok");
        driver.close();
    }
    @Test(priority = 14)
    public  void testlocarTagNameMobileNumber(){
        pause(3000);
        driver.findElement(By.tagName("input"));
        System.out.println("tagName MobileNumber is Ok");
        driver.close();
    }


}
