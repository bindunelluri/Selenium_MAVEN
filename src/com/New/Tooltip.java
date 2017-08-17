package com.New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tooltip {

	public void m1() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.javascriptkit.com//howto//toolmsg.shtml");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element=driver.findElement(By.xpath("//*[@id='contentcolumn']/form/font/input[1]"));
		action.moveToElement(element).build().perform();
		Thread.sleep(3000);
		WebElement tooltipelement=driver.findElement(By.xpath(""));
		
	
	//	driver.findElement(By.xpath("//*[@id='age']")).sendKeys("bindu");
		
	
	

		
		
	
		
		



String tooltipname=tooltipelement.getText();
System.out.println(tooltipname);
		
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Tooltip tp=new Tooltip();
		tp.m1();

	
	}

}
