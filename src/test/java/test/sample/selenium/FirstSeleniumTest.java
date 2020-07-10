package test.sample.selenium;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
	
	WebDriver driver;
	@Test
	public void testCode() {
		//Assert.assertEquals(true, false);
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hello" + Keys.ENTER );
		String text=driver.findElement(By.xpath("//div[@id=\"result-stats\"]")).getText().trim();
		System.out.println(text.split(" ")[1]);
		List<WebElement> lnk=driver.findElements(By.xpath("//h3/.."));
		System.out.println(lnk.size());
		int i=0;
		while(i<lnk.size())
		{

			System.out.println(lnk.get(i).findElement(By.tagName("h3")).getText());
			System.out.println(lnk.get(i).getAttribute("href"));
			System.out.println("------------------------");
			
		i++;
		}
		
	}

	
}
