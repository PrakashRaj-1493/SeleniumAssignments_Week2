package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		// Enter the username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");

		// Enter the password
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

		// Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Prakash");

		// Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Click on first resulting lead
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		// Verify title of the page
		String title = driver.getTitle();
		System.out.println("The title of the resulting page is" + " " + title);

		// Click Edit
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();

		// Change the company name
		WebElement clearCompany = driver.findElement(By.id("updateLeadForm_companyName"));
		clearCompany.clear();
		clearCompany.sendKeys("Google");

		// Click Update
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		// Confirm the changed name appears

		Thread.sleep(2000);

		driver.close();

	}

}
