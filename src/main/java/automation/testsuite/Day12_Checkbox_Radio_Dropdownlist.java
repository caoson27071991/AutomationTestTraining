package automation.testsuite;

import automation.common.CommonBase1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Day12_Checkbox_Radio_Dropdownlist extends CommonBase1 {
    @BeforeMethod
    public void OpenChrome(){
        driver= initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }
    @Test
    public void ClickCheckbox(){
        WebElement defaulCheckbox = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input"));
        if(defaulCheckbox.isDisplayed() == true){
            System.out.println("passed vì checkbox đã được check");
        }
        else {
            System.out.println("failed vì default checkbox chưa được checkn hoặc bị lỗi");
        }
        WebElement thischeckbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        if (thischeckbox.isDisplayed() == true){
            System.out.println("passed vì checkbox đã được check");
        }
        else {
            System.out.println("failed vì default checkbox chưa được checkn hoặc bị lỗi");
        }
    }
    @Test
    public void MutilCheckbox1(){
        List<WebElement> Listcheckbox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]//div[@class='checkbox']//input"));
        System.out.println("Tong so luong checkbox: "+Listcheckbox.size());
        for (int i =0;i<Listcheckbox.size();i++){
            WebElement checkbox = Listcheckbox.get(i);
            if (checkbox.isSelected()==true){
                System.out.println("Checkbox o vi tri thu "+(i+1)+" da duoc check");
            }
            else {
                checkbox.click();
            }
        }
        pause(2000);
        driver.close();
    }
    @Test
    public void MutilCheckbox2(){
        List<WebElement> Listcheckbox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]//div[@class='checkbox']//input"));
        System.out.println("Tong so luong checkbox: "+Listcheckbox.size());
        for (int i =0;i<Listcheckbox.size();i++){
            WebElement checkbox = driver.findElement(By.xpath("(//div[@class='panel-body'])[3]//div[@class='checkbox']["+(i+1)+"]//input"));
            if (checkbox.isSelected()==true){
                System.out.println("Checkbox o vi tri thu "+(i+1)+" da duoc check");
            }
            else {
                checkbox.click();
                System.out.println("checkbox ở vị trí " +(i+1)+ " đã được click:" +checkbox.isSelected());
            }
        }
        pause(2000);
        driver.close();
    }

}

