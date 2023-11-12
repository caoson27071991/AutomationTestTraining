package automation.testsuite;

import automation.common.CommonBase1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day12_RadioButton extends CommonBase1 {
    @BeforeMethod
    public void OpenChrome(){
        driver= initChromeDriver("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }
    @Test
    public void handleRadiobutton(){
        WebElement FemaleRadio = driver.findElement(By.xpath("//input[@name='optradio'and @value='Female' ]"));
        if(FemaleRadio.isEnabled()== false){
            pause(3000);
        }
        if (FemaleRadio.isSelected()==false){
            FemaleRadio.click();
        }
    }
}
