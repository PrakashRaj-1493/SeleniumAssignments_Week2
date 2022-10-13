package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click create new button
		WebElement createNew = driver.findElement(By.linkText("Create New Account"));
		createNew.click();

		// enter your firstName
		driver.findElement(By.name("firstname")).sendKeys("Prakash");

		// enter your lastName
		driver.findElement(By.name("lastname")).sendKeys("Raj");

		// enter your mobile number
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7708888280");

		// type your password
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("prakash@");

		//select gender
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();

		// select day using value
		WebElement elementDay = driver.findElement(By.id("day"));
		Select dd1 = new Select(elementDay);
		dd1.selectByValue("27");

		// select month using index
		WebElement elementMonth = driver.findElement(By.id("month"));
		Select dd2 = new Select(elementMonth);
		dd2.selectByIndex(8);

		// select year using visible text
		WebElement elementYear = driver.findElement(By.id("year"));
		Select dd3 = new Select(elementYear);
		dd3.selectByVisibleText("1993");

	}

}
