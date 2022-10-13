package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch URL
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		// enter your username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");

		// enter password
		WebElement userPass = driver.findElement(By.id("password"));
		userPass.sendKeys("crmsfa");

		// click login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

		// click crm/sfa link
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();

		// click leads
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();

		// click create lead
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();

		// enter company name
		WebElement elementCompName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompName.sendKeys("TCS");

		// enter firstname
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Vidhya");

		// enter lastname
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Priya");

		// enter local guardian name
		WebElement localFirstName = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		localFirstName.sendKeys("Prakash");
		WebElement lastLocalName = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lastLocalName.sendKeys("Raj");

		// enter the department
		WebElement departmentField = driver.findElement(By.id("createLeadForm_departmentName"));
		departmentField.sendKeys("IT-Software Testing");

		// enter the description
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Working Fine As of Now");

		// enter your mail
		WebElement primaryMail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryMail.sendKeys("prakash14@gmail.com");

		// title of resulting page
		String title = driver.getTitle();
		System.out.println("The title of the resulting page is:" + " " + title);

		WebElement btnCreateLead = driver.findElement(By.className("smallSubmit"));
		btnCreateLead.click();

		driver.close();

	}

}
