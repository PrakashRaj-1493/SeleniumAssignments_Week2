package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //fav most browser=safari
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
        
		//default selected radioButton
		String safari = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).getText();
		System.out.println("The default selected RadioButton is"+" "+safari);

		//select age group if not selected
		driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[2]/div[1]/div[2]/span[1]")).click();
		
		driver.close();

	}

}
