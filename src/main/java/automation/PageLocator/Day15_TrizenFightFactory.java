package automation.PageLocator;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Day15_TrizenFightFactory {
    WebDriver driver;
    @FindBy(xpath = "//a[@id='one-way-tab']")
    private WebElement OnewayRadio;
    @FindBy(xpath = "//div[@id='one-way']//div[@class='col-lg-6 pr-0']//input[@placeholder='City or airport']")
    private WebElement Flyingfromtxt;
    @FindBy(xpath = "//div[@id='one-way']//div[@class='col-lg-6']//input[@placeholder='City or airport']")
    private WebElement Flyingtotxt;
    @FindBy(xpath = "(//a[@class='dropdown-toggle dropdown-btn'])[1]")
    private WebElement PassengersDrop;
    @FindBy(xpath = "(//label[text()='Adults'])[1]//following-sibling::div//div[@class='qtyInc']//i")
    private WebElement AdultsAddpoin;
    @FindBy(xpath = "(//select[@class='select-contain-select'])[3]//parent::div")
    private WebElement CoachDrop;
    @FindBy(xpath = "//a[@id='bs-select-3-0' and normalize-space()='Economy']")
    private WebElement EconomyDrop;
    @FindBy(xpath = "//div[@id='one-way']//a[text()='Search Now']")
    private WebElement SearchNowBotton;

    public Day15_TrizenFightFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void TrizenFightFactory(String flyingfrom,String flyingto,String date){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        if (OnewayRadio.isSelected()==true){}
        else {
        OnewayRadio.click();}
        Flyingfromtxt.clear();
        Flyingfromtxt.sendKeys(flyingfrom);
        Flyingtotxt.clear();
        Flyingtotxt.sendKeys(flyingto);
        WebElement dateBox = driver.findElement(
                By.xpath("(//label[text()='Departing']/following-sibling::div//input[@name='daterange-single'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", dateBox);
        dateBox.clear();
        dateBox.sendKeys(date);
        dateBox.sendKeys(Keys.TAB);
        PassengersDrop.click();
        AdultsAddpoin.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        CoachDrop.click();
        EconomyDrop.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        SearchNowBotton.click();

    }
}
