package org.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class coffee {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mselva\\Oxygen eclipse-workspace\\SeleniumProgram\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement user=driver.findElement(By.id("email"));

		js.executeScript("arguments[0].setAttribute('value','jackmavles')", user);
		
		WebElement pass=driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','12345')", pass);
		
		WebElement login=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()",login);
		
		/*Object o1=js.executeScript("return arguments[0].getAttribute('value')", user);
		
		Object o2=js.executeScript("return arguments[0].getAttribute('value')", pass);
		
		String s1=(String)o1;
		String s2=(String)o2;
		
		System.out.println(s1);
		System.out.println(s2);*/
				
		TakesScreenshot s=(TakesScreenshot)driver;
		File src=s.getScreenshotAs(OutputType.FILE);
		
		File f=new File("C:\\Users\\mselva\\Oxygen eclipse-workspace\\SeleniumProgram\\pictures\\firstFB.png");
		
		FileUtils.copyFile(src, f);
		
		
		
	}

}
