package test.sample.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassDemo {

	public static void main(String args[]) {
	/*	Xyz obj = new Xyz();
		obj.printVariableData();
		System.out.println(obj.z);
		
		ABC abc = new ABC();
		System.out.print(abc.z);*/
		
		ABC o = new ABC(1,"x",true);
		//ABC a = new Xyz(); //X
		o.printVariableData();
		//sendText(new ChromeDriver());
	}
	public void sendText(ChromeDriver driver) {
		driver.findElement(By.xpath("")).sendKeys("hreljre");
		
		//driver.find
	}
	
	public void sendText(FirefoxDriver driver) {
		driver.findElement(By.xpath("")).sendKeys("hreljre");
	}
	
	public void sendText(WebDriver driver) {
		driver.findElement(By.xpath("")).sendKeys("hreljre");
		//driver.f
	}
}




