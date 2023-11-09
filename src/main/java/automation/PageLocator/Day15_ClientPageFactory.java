package automation.PageLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Day15_ClientPageFactory {
    private WebDriver driver;

    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement SignInButton;
    @FindBy(xpath = "//span[text()='Clients']//parent::a//parent::li")
    private WebElement ClientsButton;
    @FindBy(xpath = "//a[text()=' Add client']")
    private WebElement AddClientsButton;
    @FindBy(xpath = "//input[@id='type_person']")
    private WebElement PersonRadio;
    @FindBy(xpath = "//input[@id='company_name']")
    private WebElement Companytxt;
    @FindBy(xpath = "//div[@id='s2id_created_by']")
    private WebElement selectOwner;
    Select SelectOwner = new Select(selectOwner);
    @FindBy(xpath = "//textarea[@id='address']")
    private WebElement Addresstxt;
    @FindBy(xpath = "//button[text()=' Save']")
    private WebElement SaveButton;
    @FindBy(xpath = "//span[text()='Total clients']//parent::div")
    private WebElement TotalClients;
    @FindBy(xpath = "//input[@type='search']")
    private WebElement Searchtxt;
    @FindBy(xpath = "//td[@class=' all']//a[text()='Company01']")
    private WebElement SeachResutl;






    public Day15_ClientPageFactory(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }
}
