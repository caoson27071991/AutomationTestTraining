package automation.HomeWork;

import automation.common.CommonBase1;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day10_HomeWork extends CommonBase1 {
    @BeforeMethod
    public void initChromeDriver(){
        initChromeDriver("https://alada.vn/tai-khoan/dang-ky.html");
    }
    @Test (priority = 1)
    public void Bai_1a(){
        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtEmail']")).sendKeys("Admin1@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Nhập lại địa chỉ email']")).sendKeys("Admin1@gmail.com");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Admin123456");
        driver.findElement(By.xpath("//input[@name='txtCPassword']")).sendKeys("Admin123456");
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Chúng tôi cam kết')]")).sendKeys("0168268268");
        driver.findElement(By.xpath("//input[@id='chkRight']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='ĐĂNG KÝ'and @class='btn btn_pink_sm fleft marright15']"));
        pause(3000);
        driver.close();
        System.out.println("Bài 1a : xpath ok");
    }
    @Test (priority = 2)
    public void Bai_1b(){
        pause(10);
        driver.findElement(By.xpath("//a[@class='btn-anis-effect'and contains(@href,'dang-nhap')]")).click();
        driver.findElement(By.xpath("//input[@name='txtLoginUsername']")).sendKeys("caoson27071991@gmail.com");
        driver.findElement(By.xpath("//input[@id='txtLoginPassword']")).sendKeys("Caoson1!");
        driver.findElement(By.xpath("//button[text()='ĐĂNG NHẬP' and contains(@class,'btn_pink fs18')]")).click();

        driver.findElement(By.xpath("(//img[@src='images/member/1.png'])[1]")).click();
        driver.findElement(By.xpath("//a[@class='fs14']")).click();
        driver.findElement(By.xpath("//input[@id='member_lastname']")).sendKeys("Ngô");
        driver.findElement(By.xpath("//input[@id='member_firstname']"));
        driver.findElement(By.xpath("//input[@name='member_gender[]'and @value='1']"));
        driver.findElement(By.xpath("//select[@id='txtCity']")).click();
        driver.findElement(By.xpath("//option[@value='33']")).click();
        driver.findElement(By.xpath("//input[@id='member_tel']"));
        driver.findElement(By.xpath("//input[@id='member_address']")).sendKeys("Thanh Xuân - Hà Nội");
        driver.findElement(By.xpath("//input[@id='member_company']")).sendKeys("ABC");
        driver.findElement(By.xpath("//button[text()='Lưu thông tin']"));
        driver.findElement(By.xpath("//input[@id='txtpassword']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@id='txtnewpass']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@id='txtrenewpass']")).sendKeys("abcde");
        pause(5000);
        driver.close();
        System.out.println("Bài 1b : xpath ok");
    }
    @Test (priority = 3)
    public void Bai_2() {
        pause(3000);
        driver.navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        driver.findElement(By.xpath("//input[@name='optradio'and @value='Male']")).click();
        driver.findElement(By.xpath("//input[@name='optradio'and @value='Female']")).click();
        driver.findElement(By.xpath("//input[@name='gender'and @value='Male']")).click();
        driver.findElement(By.xpath("//input[@name='gender'and @value='Female']")).click();
        driver.findElement(By.xpath("//input[@name='ageGroup' and @value='0 - 5']")).click();
        driver.findElement(By.xpath("//input[@name='ageGroup' and @value='5 - 15']")).click();
        driver.findElement(By.xpath("//input[@name='ageGroup' and @value='15 - 50']")).click();
        pause(3000);
        driver.close();
        System.out.println("Bài 2 : xpath ok");
    }
}
