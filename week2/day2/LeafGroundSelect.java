package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// fav automation tool
		WebElement favAutomationTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dd1 = new Select(favAutomationTool);
		dd1.selectByVisibleText("Playwright");

		// preferred country
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-triangle-1-s')]")).click();
		driver.findElement(By.id("j_idt87:country_3")).click();

		// preferred city
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[contains(@class,'ui-selectonemenu-label ui-inputfield')])[2]")).click();
		driver.findElement(By.xpath("//li[text()='Bengaluru']")).click();

		// selecting preferred course
		Thread.sleep(2000);
		WebElement selectCourse = driver
				.findElement(By.xpath("//span[contains(@class,'ui-button-icon-primary ui-icon')]"));
		selectCourse.click();
		driver.findElement(By.xpath("//li[text()='AWS']")).click();

		Thread.sleep(3000);
		selectCourse.click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@data-item-label='RestAssured']")).click();

		Thread.sleep(3000);
		selectCourse.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='JMeter']")).click();

		Thread.sleep(3000);
		selectCourse.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-item-label='PostMan']")).click();

		// select language randomly
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[contains(@class,'ui-selectonemenu-label ui-inputfield')])[3]")).click();
		driver.findElement(By.id("j_idt87:lang_2")).click();

		// select irrespective lang choosen
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Select Values')]")).click();
		driver.findElement(By.id("j_idt87:value_3")).click();
		
		driver.close();

	}

}
