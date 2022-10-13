package week2.day2;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		//take me to the dashboard
		WebElement dashBoard = driver.findElement(By.xpath("//a[@class='ui-link ui-widget']"));
		dashBoard.click();
		String title = driver.getTitle();
		if(title.contains("Dashboard")) {
			System.out.println("Page directed to the Dashboard");
		}else {
			System.out.println("Page not directed properly");
		}
		
		driver.navigate().back();
		
		//destination URL without clicking
		Thread.sleep(3000);
		String attribute = driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href");
		System.out.println("The destination URL is"+" "+attribute);
		
		//count number of links
		Thread.sleep(3000);
		driver.findElement(By.linkText("How many links in this page?")).click();
		int numberOfLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("The number of links in the WebPage is"+" "+numberOfLinks);
		
		driver.navigate().back();
		
		//count number of layout links
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='list.xhtml']")).click();
		int layoutLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("The number of Layout links in the WebPage is"+" "+layoutLinks);
		
		driver.close();
		
		
		

	}

}
