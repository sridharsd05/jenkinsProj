package com.Testng;

import java.io.File;
import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng_Project {

	public static WebDriver driver;

	@Test
	public void browserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");

	}

	@Test
	public void login() throws InterruptedException {

		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Sridhar05");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Sridhar@7200");

		WebElement login = driver.findElement(By.xpath("//input[@class='login_button']"));
		login.click();
		Thread.sleep(4000);
	}

	@Test
	public void searchAndBook() throws InterruptedException {

		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select sl = new Select(location);
		sl.selectByIndex(5);

		WebElement Hotels = driver.findElement(By.id("hotels"));
		Select s2 = new Select(Hotels);
		s2.selectByVisibleText("Hotel Sunshine");

		WebElement roomtype = driver.findElement(By.name("room_type"));
		Select s3 = new Select(roomtype);
		s3.selectByIndex(3);

		WebElement noofrooms = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(noofrooms);
		s4.selectByIndex(6);

		WebElement adultsperroom = driver.findElement(By.name("adult_room"));
		Select s5 = new Select(adultsperroom);
		s5.selectByIndex(2);

		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s6 = new Select(childroom);
		s6.selectByIndex(1);

		driver.findElement(By.name("Submit")).click();

	

	

		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();

		driver.findElement(By.className("reg_button")).click();



	

		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("Sridhar");

		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("05");

		WebElement address = driver.findElement(By.className("txtarea"));
		address.sendKeys("Kamarajapuram,Velachery-600024");

		WebElement creditcard = driver.findElement(By.xpath("//input[@name='cc_num']"));
		creditcard.sendKeys("5484856404747564");

		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s7 = new Select(cardtype);
		s7.selectByIndex(3);

		WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s8 = new Select(month);
		s8.selectByIndex(4);

		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s9 = new Select(year);
		s9.selectByIndex(6);

		driver.findElement(By.name("cc_cvv")).sendKeys("345");

		driver.findElement(By.xpath("//input[@type='button'][1]")).click();
		Thread.sleep(7000);
	

	

		
		driver.findElement(By.id("my_itinerary")).click();
		Thread.sleep(4000);
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File sc = ts.getScreenshotAs(OutputType.FILE);
//		File dst = new File("C:\\Users\\sridhar\\eclipse-workspace\\Selenium_Concepts\\Screenshots\\adactin.png");
//		FileHandler.copy(sc, dst);

		driver.findElement(By.xpath("//input[@id='logout']")).click();
		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();

	}
}
