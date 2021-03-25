package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ismethod {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mselva\\Oxygen eclipse-workspace\\SeleniumProgram\\driver2\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		boolean enab=driver.findElement(By.cssSelector("input[type='text']")).isEnabled();
		System.out.println(enab);
		
		boolean dis=driver.findElement(By.xpath("//a[.='Create New Account']")).isDisplayed();
		System.out.println(dis);
		
		
		
	}

}
