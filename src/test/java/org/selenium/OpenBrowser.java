package org.selenium;

import java.util.Scanner;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {

		Scanner a = new Scanner(System.in);

		System.out.println("Enter Browser Name");

		String browser = a.nextLine();

		WebDriver driver = null;

		if (browser.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mselva\\Oxygen eclipse-workspace\\SeleniumProgram\\driver2\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (browser.equals("gecko")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\mselva\\Oxygen eclipse-workspace\\SeleniumProgram\\driver1\\geckodriver.exe");

			driver = new ChromeDriver();

		}

		else {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\mselva\\Oxygen eclipse-workspace\\SeleniumProgram\\driver1\\IEDriverServer.exe");

			driver = new ChromeDriver();

		}
		
		driver.get("https://www.facebook.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		Dimension d=new Dimension(500,500);
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		
		Point p = new Point(250, 250);
		driver.manage().window().setPosition(p);
		
		Dimension position = driver.manage().window().getSize();
		System.out.println(position);
		
		
		

	}

}
