package org.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mselva\\Oxygen eclipse-workspace\\SeleniumProgram\\driver2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("selenium");

		driver.findElement(By.xpath("//input[@type=\"submit\"][1]")).submit();

		String XP= "//span[contains(text(),'Selenium')]";
		
		List<WebElement> selenium = driver.findElements(By.xpath("XP"));

		int size = selenium.size();
		
		for (int i = 0; i <= size; i++) {
			
			WebElement single=selenium.get(i);
			System.out.println(single.getText());
			
		}

		/*
		 * driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		 * 
		 * 
		 * 
		 * List<WebElement> radio=driver.findElements(By.tagName("link"));
		 * 
		 * int size=radio.size(); System.out.println(size);
		 * 
		 * for (WebElement x : radio) {
		 * 
		 * System.out.println(x.getAttribute("href"));
		 * 
		 * }
		 */

	}

}
