package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundInput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// type your name
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:name")).sendKeys("Prakash Raj");

		// append country name to city
		WebElement countryName = driver.findElement(By.id("j_idt88:j_idt91"));
		countryName.sendKeys(":India");

		// verify textbox disabled or not
		boolean disabled = driver.findElement(By.id("j_idt88:j_idt93")).isDisplayed();
		System.out.println("The textbox disabled is" + " " + disabled);

		// clear the typed text
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:j_idt95")).clear();

		// retreive the given input text
		WebElement retreiveText = driver.findElement(By.id("j_idt88:j_idt97"));
		String text = retreiveText.getAttribute("value");
		System.out.println("The Retreived text from the textbox is" + " " + text);

		// type mail and tab
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("prakash1493@gmail.com", Keys.TAB);

		// type about yourself
		WebElement description = driver.findElement(By.tagName("textarea"));
		description.sendKeys(
				" I thrive on challenge and constantly set goals for myself, so I have something to strive towards.");

		// confirm error message
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		String errorMessgae = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		System.out.println("The Error message is" + " " + errorMessgae);

		// type your name and choose third option
		Thread.sleep(2000);
		WebElement typeName = driver.findElement(By.id("j_idt106:auto-complete_input"));
		typeName.sendKeys("Prakash");
		driver.findElement(By.xpath("//li[@data-item-label='Prakash3']")).click();

		// type dob and confirm
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("10/14/1993");
		WebElement bdayDate = driver.findElement(By.id("j_idt106:j_idt116_input"));
		String bday = bdayDate.getText();
		if (!bdayDate.equals(bday)) {
			System.out.println("You have choosen the DOB correctly");
		} else {
			System.out.println("You have not choosen the DOB correctly");

		}

		// type number and confirm the value change
		Thread.sleep(2000);
		WebElement sendNumber = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']"));
		sendNumber.sendKeys("99");
		String textNum = sendNumber.getText();
		driver.findElement(By.xpath("(//span[@class='ui-button-text'])[3]")).click();
		WebElement textTwo = driver.findElement(By.id("j_idt106:j_idt118_input"));
		String textSecondNum = textTwo.getText();
		if (!textNum.equals(textSecondNum)) {
			System.out.println("The Number is not Changed");
		} else {
			System.out.println("The Number is Changed");
		}

		driver.close();

	}

}
