package automation.HomeWork;

import automation.common.CommonBase1;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day9_HomeWork extends CommonBase1 {
    @BeforeMethod
   public void initChromedriver(){
        initChromeDriver("https://selectorshub.com/xpath-practice-page/");
    }
    @Test (priority = 1)
    public void Bai_1(){
        driver.findElement(By.xpath("//input[@id='userId']"));
        driver.findElement(By.xpath("//input[@name='Password']"));
        driver.findElement(By.xpath("(//input[@name='company'])[1]"));
        driver.findElement(By.xpath("//input[@name='mobile number'][1]"));
        driver.findElement(By.xpath("//input[@value='Submit']"));
        driver.close();
        System.out.println("Bài 1 : xpath ok");

    }
    @Test (priority = 2)
    public void Bai_2() {
        driver.navigate().to("https://chercher.tech/practice/dynamic-table");
        driver.findElement(By.xpath("//button[@id='blue']"));
        driver.findElement(By.xpath("//div[@id='pancakes'][2]/button[2]"));
        driver.findElement(By.xpath("//div[@id='unique'][1]/button[3]"));
        driver.findElement(By.xpath("//div[@id='unique'][2]/button[1]"));
        driver.findElement(By.xpath("//div[@id='unique'][2]/button[3]"));
        driver.findElement(By.xpath("//input[@value='     Zack    Snyder    ']"));
        driver.close();
        System.out.println("Bài 2 : xpath ok");
    }
    @Test (priority = 3)
    public void Bai_3() {
        driver.findElement(By.xpath("//tbody/tr[@class='usr_acn'][3]"));
        driver.findElement(By.xpath("//tbody/tr[@class='plan rit'][2]"));
        driver.findElement(By.xpath("//tbody/tr[@class='plan rit'][3]"));
        driver.close();
        System.out.println("Bài 3 : xpath ok");
    }
    @Test (priority = 4)
    public void Bai_4() {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b']"));
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='RNmpXc']"));
        driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        driver.close();
        System.out.println("Bài 4 : xpath ok");
    }
}
