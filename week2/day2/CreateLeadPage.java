package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");

		WebElement userPass = driver.findElement(By.id("password"));
		userPass.sendKeys("crmsfa");

		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();

		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();

		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();

		WebElement elementCompName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompName.sendKeys("TCS");

		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Prakash");

		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Raj");

		WebElement localFirstName = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		localFirstName.sendKeys("Vidhya");

		WebElement lastLocalName = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lastLocalName.sendKeys("priya");

		WebElement departmentField = driver.findElement(By.id("createLeadForm_departmentName"));
		departmentField.sendKeys("IT-Software Testing");

		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Working Fine As of Now");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7708888280");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");

		WebElement generalCountryGeoId = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		new Select(generalCountryGeoId).selectByVisibleText("India");

		WebElement primaryMail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryMail.sendKeys("prakash1493@gmail.com");

		String title = driver.getTitle();
		System.out.println("The title of the resulting page is:" + " " + title);

		WebElement btnCreateLead = driver.findElement(By.className("smallSubmit"));
		btnCreateLead.click();

		driver.close();

	}

}
