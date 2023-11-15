package automation.constant;

import org.openqa.selenium.By;

public class CT_LocatorRise {
    public static By Email = By.id("email");
    public static By Password = By.id("password");
    public static By SignIn = By.xpath("//button[text()='Sign in']");
    public static By SignOut = By.xpath("//a[text()=' Sign Out']//parent::li");
    public static By Therecord = By.xpath("//div[contains(text(),'The record')]");
    public static By Authenticationfailed = By.xpath("//div[normalize-space()='Authentication failed!']");
    public static By Dashboard = By.xpath("//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']");
    public static By MyAvata = By.xpath("//a[@id='user-dropdown']//parent::li");
    public static By Successfully = By.xpath("//div[text()='Your account has been created successfully! ']");
    public static String webURLRise = "https://rise.fairsketch.com/signin?redirect=https://rise.fairsketch.com/events";
    public static String webURLTeachydevs = "https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html";
    public static String webURLDemoQuru99 = "https://demo.guru99.com/test/delete_customer.php";
    public static String webURLDemoAutomation = "https://demo.automationtesting.in/Alerts.html";
    public static String webPupupURL = "https://demo.guru99.com//popup.php";
    public static String webCodestar = "https://codestar.vn/";

}
