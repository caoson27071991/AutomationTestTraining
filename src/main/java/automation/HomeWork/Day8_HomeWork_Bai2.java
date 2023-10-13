package automation.HomeWork;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class Day8_HomeWork_Bai2 extends CommonBase {
    @BeforeMethod
    public void initChromeWebDriver() {
        initChromeDriver("https://automationfc.github.io/basic-form/index.html");
    }
    @Test
    public void locatorNamebyId(){
        WebElement id = driver.findElement(By.id("name"));
        System.out.println("Locator Name By id : "+id);
        driver.close();
    }
    @Test
    public void locatorNamebyName(){
        WebElement name = driver.findElement(By.name("name"));
        System.out.println("Locator Name By name : "+name);
        driver.close();
    }
    @Test
    public void locatorNamebyTagName(){
        WebElement tagname = driver.findElement(By.tagName("input"));
        System.out.println("Locator Name By tagname : "+tagname);
        driver.close();
    }
    @Test
    public void locatorAdressbyId(){
        WebElement id = driver.findElement(By.id("address"));
        System.out.println("Locator Adress By id : "+id);
        driver.close();
    }
    @Test
    public void locatorAdressbyName(){
        WebElement name = driver.findElement(By.name("address"));
        System.out.println("Locator Adress By name : "+name);
        driver.close();
    }
    @Test
    public void locatorAdressbyTagName(){
        WebElement tagname = driver.findElement(By.tagName("textarea"));
        System.out.println("Locator Adress By tagname : "+tagname);
        driver.close();
    }
    @Test
    public void locatorEmailbyId(){
        WebElement id = driver.findElement(By.id("email"));
        System.out.println("Locator Email By id : "+id);
        driver.close();
    }
    @Test
    public void locatorEmailbyName(){
        WebElement name = driver.findElement(By.name("email"));
        System.out.println("Locator Email By id : "+name);
        driver.close();
    }
    @Test
    public void locatorEmailbyTagname(){
        WebElement tagname = driver.findElement(By.tagName("input"));
        System.out.println("Locator Email By tagname : "+tagname);
        driver.close();
    }
    @Test
    public void locatorPasswordbyId(){
        WebElement id = driver.findElement(By.id("password"));
        System.out.println("Locator Password By id : "+id);
        driver.close();
    }
    @Test
    public void locatorPasswordbyName(){
        WebElement name = driver.findElement(By.name("password"));
        System.out.println("Locator Password By id : "+name);
        driver.close();
    }
    @Test
    public void locatorPasswordbyTagname(){
        WebElement tagname = driver.findElement(By.tagName("input"));
        System.out.println("Locator Password By id : "+tagname);
        driver.close();
    }
}
