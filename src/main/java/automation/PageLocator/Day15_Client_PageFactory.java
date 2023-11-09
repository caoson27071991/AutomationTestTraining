package automation.PageLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day15_Client_PageFactory {
    private WebDriver driver;

    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement SignInButton;

    @FindBy(xpath = "//span[text()='Clients']")
    WebElement clientsMenu;

    @FindBy(xpath = "//a[@title='Add client']")
    WebElement btnAddClient;

    @FindBy(xpath = "//input[@id='company_name']")
    WebElement textCompanyName;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    @FindBy(xpath = "//span[text()='Total clients']//parent::div")
    private WebElement TotalClients;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement Searchtxt;

    @FindBy(xpath = "//td[@class=' all']//a[text()='Company03']")
    private WebElement SeachResutl;

    public Day15_Client_PageFactory(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);
    }

    public void AddnewClientFunction(String companyName) throws InterruptedException {
        SignInButton.click();
        clientsMenu.click();
        btnAddClient.click();
        Thread.sleep(3000);
        textCompanyName.sendKeys(companyName);
        btnSave.click();
        Thread.sleep(3000);
        TotalClients.click();
        Thread.sleep(3000);
        Searchtxt.sendKeys(companyName);
        Thread.sleep(3000);

    }

}
