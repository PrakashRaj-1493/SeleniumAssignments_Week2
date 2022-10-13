package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// get the title
		String title = driver.getTitle();
		System.out.println("The Title of this page is" + " " + title);

		// check whether the button is disabled
		boolean displayed = driver.findElement(By.xpath("(//div[@class='card'])[2]")).isDisplayed();
		System.out.println("The button disabled is" + " " + displayed);

		// position of submit button
		WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
		Point str = position.getLocation();
		System.out.println("The position of the button is" + " " + str);

		// colour of save button, background-color: rgb(96, 125, 139);
		String cssValue = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println("The colour of the Button save is" + " " + cssValue);

		// get the height and width of the button
		WebElement btnSize = driver.findElement(By.id("j_idt88:j_idt98"));
		Dimension size = btnSize.getSize();
		System.out.println("The height and width of the Button is" + " " + size);

		// mousehover and confirm colour change
		Thread.sleep(3000);
		WebElement mouseHover = driver.findElement(By.id("j_idt88:j_idt100"));
		Actions action = new Actions(driver);
		action.moveToElement(mouseHover).build().perform();
		System.out.println("The colour has been changed");

		// click image button
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']")).click();
		System.out.println();
		
		driver.close();

	}

}
