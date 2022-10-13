package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter the username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");

		// //Enter the password
		WebElement userPass = driver.findElement(By.id("password"));
		userPass.sendKeys("crmsfa");

		// Click Login
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

		// Click crm/sfa linkText
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();

		// Click Leads link
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();

		// Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		Thread.sleep(5000);

		// Click on Phone
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();

		// Enter phone number
		Thread.sleep(5000);
		driver.findElement(By.name("phoneNumber")).sendKeys("7708888280");

		// Click find leads button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Capture lead ID of First Resulting lead
		Thread.sleep(5000);
		String str = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("Captured Lead ID is" + " " + str);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		// click delete
		driver.findElement(By.linkText("Delete")).click();

		// click find leads button
		driver.findElement(By.linkText("Find Leads")).click();

		// Enter captured LeadId
		driver.findElement(By.name("id")).sendKeys(str);

		// Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Verify message "No records to display" in the Lead List. This message
		// confirms the successful deletion
		String noRecord = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(noRecord);

		if (noRecord.contains("No records to display")) {

			System.out.println("The LeadId has been deleted Succesfully");
		} else {
			System.out.println("The LeadId is not Deleted");
		}
		Thread.sleep(5000);
		driver.close();

	}

}
