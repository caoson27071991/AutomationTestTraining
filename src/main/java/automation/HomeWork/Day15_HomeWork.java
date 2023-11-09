package automation.HomeWork;

import automation.PageLocator.Day15_TrizenFightFactory;
import automation.common.CommonBase;
import automation.constant.Locator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day15_HomeWork extends CommonBase {
    @BeforeMethod
    public void OpenChrome(){
        driver = initChromeDriver(Locator.webURL2);
    }
    @Test
    public void FindFlights(){
        pause(3000);
        Day15_TrizenFightFactory findlights = new Day15_TrizenFightFactory(driver);
        findlights.TrizenFightFactory("Ha Noi","Ho Chi Minh","25112023");
        pause(3000);
    }
    @AfterMethod
    public void CloseChrome(){
        quitDriver(driver);
    }

}

