package automation.testsuite;

import automation.PageLocator.Day15_TrizenFightFactory;
import automation.common.CommonBase1;
import automation.constant.CT_LocatorRise;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day15_TrizenFlight extends CommonBase1 {
    @BeforeMethod
    public void OpenChrome(){
        driver = initChromeDriver(CT_LocatorRise.webURLDemoQuru99);
    }
    @Test
    public void FindFlights(){
        pause(3000);
        Day15_TrizenFightFactory findlights = new Day15_TrizenFightFactory(driver);
        findlights.TrizenFightFactory("Ha Noi","Ho Chi Minh","25112023");
        pause(5000);
    }
    @AfterMethod
    public void CloseChrome(){
        quitDriver(driver);
    }

}
