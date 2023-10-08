package Day16_alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day16_AlertSendKeys extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initDriverTest("https://demo.automationtesting.in/Alerts.html");
	}

	@Test
	public void TestAlert01() throws InterruptedException {

		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("123");
		alert.accept();
		Thread.sleep(2000);

	}
}

