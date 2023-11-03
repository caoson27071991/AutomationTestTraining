package automation.constant;

import org.openqa.selenium.By;

public class Locator {
    public static By Email = By.id("email");
    public static By Password = By.id("password");
    public static By SignIn = By.xpath("//button[text()='Sign in']");
    public static By Authenticationfailed = By.xpath("//div[normalize-space()='Authentication failed!']");
    public static By Dashboard = By.xpath("//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']");
    public static By MyAvata = By.xpath("//a[@id='user-dropdown']//parent::li");
    public static By SignOut = By.xpath("//a[text()=' Sign Out']//parent::li");
    public static By Therecord = By.xpath("//div[contains(text(),'The record')]");
    public static By Successfully = By.xpath("//div[text()='Your account has been created successfully! ']");
    public static String webURL = "https://rise.fairsketch.com/signin?redirect=https://rise.fairsketch.com/events";
}
