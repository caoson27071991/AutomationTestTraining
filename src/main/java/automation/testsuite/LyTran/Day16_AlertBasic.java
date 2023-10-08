
package Day16_alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day16_AlertBasic extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initDriverTest("https://demo.guru99.com/test/delete_customer.php");
	}

	@Test
	public void TestAlert01() throws InterruptedException {
		driver.findElement(By.name("cusid")).sendKeys("123456");
		driver.findElement(By.name("submit")).submit();
//	 Khai báo chuyển hướng đến Alert với đối tượng
		Alert alert = driver.switchTo().alert();
//	 Get message trên alert
		String alertMessage = driver.switchTo().alert().getText();
//	 Hiện ra trên Console nội dung của alert message
		System.out.println(alertMessage);
		Thread.sleep(2000);
		
		
		////////////////////////////////////////////accept() = nhấn Ok button 
//		driver.switchTo().alert().accept(); // Cách 1: nhấn Ok button 
		
//		alert.accept(); //Cách 2: nhấn Ok button 
		
		///////////////////////////////////////////////////dismiss() = nhấn Cancel button
	 
//		driver.switchTo().alert().dismiss(); // Cách 1: nhấn Cancel button 
		
		alert.dismiss(); //Cách 2: nhấn Cancel button
		
		
		
		
		Thread.sleep(2000);
	}

}
