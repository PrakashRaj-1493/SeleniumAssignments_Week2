package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch URL
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		// enter username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");

		// enter password
		WebElement userPass = driver.findElement(By.id("password"));
		userPass.sendKeys("crmsfa");

		// click login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

		// click crm/sfa linktext
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();

		// click leads
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();

		// click create lead
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();

		// enter company name
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("TCS");

		// enter firsname
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Vidhya");

		// enter lastname
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Prakash");

		// enter local guardian name
		WebElement elementLocalFName = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementLocalFName.sendKeys("Gandhimathi");

		// enter dept name
		WebElement elementDeptName = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDeptName.sendKeys("IT-Software Testing");

		// enter your description
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Set to go");

		// enter your mail
		WebElement elementPrimaryMail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementPrimaryMail.sendKeys("prakash14@gmail.com");

		// click create button
		WebElement btnCreateLead = driver.findElement(By.className("smallSubmit"));
		btnCreateLead.click();

		// click edit button
		WebElement btnEditLead = driver.findElement(By.linkText("Edit"));
		btnEditLead.click();

		// clear description
		WebElement clearDescription = driver.findElement(By.id("updateLeadForm_description"));
		clearDescription.clear();

		// add notes
		WebElement updateImpNote = driver.findElement(By.id("updateLeadForm_importantNote"));
		updateImpNote.sendKeys("Updated successfully");

		// click update button
		WebElement btnUpdate = driver.findElement(By.className("smallSubmit"));
		btnUpdate.click();

		// get title of resulting page
		String title = driver.getTitle();
		System.out.println("The title of the resulting Page is" + " " + title);
		
		driver.close();


	}

}
