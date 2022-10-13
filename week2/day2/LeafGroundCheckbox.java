package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Basic checkbox
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();

		// Notification
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();

		// toggle switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String check = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		if (check.contains("Checked")) {
			System.out.println("The Toggle Switch is turned On");
		} else {
			System.out.println("The Toggle Switch is turned Off");

		}

		// fav languages
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
		driver.findElement(By.xpath("//table[@id='j_idt87:basic']/tbody[1]/tr[1]/td[2]/div[1]/div[2]")).click();

		// Tristate checkbox
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();
		String stateHasBeen = driver.findElement(By.xpath("//span[text()='State has been changed.']")).getText();
		String state = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		System.out.println(stateHasBeen);
		System.out.println(state);

		// verify check box is disabled
		boolean enabled = driver
				.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isEnabled();
		System.out.println("The checkbox disabled is" + " " + enabled);

		// select multiple
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[2]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[3]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[4]/div[1]/div[2]")).click();

		driver.close();

	}

}
