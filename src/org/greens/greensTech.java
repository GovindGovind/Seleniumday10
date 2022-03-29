package org.greens;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greensTech {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclips\\Seleniumday10\\driver\\chromedriver.exe");
	
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://greenstech.in/selenium-course-content.html"); 
	    driver.findElement(By.id("heading302")).click();
	   driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/Day4_ControlStatements.txt']")).click();
	   
	   String paraentId = driver.getWindowHandle();
	   
	   Set<String> Allwindows = driver.getWindowHandles();
	    List<String> li=new ArrayList<>();
	    li.addAll(Allwindows);
	    driver.switchTo().window(li.get(1));
	    WebElement quest1 = driver.findElement(By.xpath("//pre[contains(text(),'URL : https://www.facebook.com/')]"));
           String text = quest1.getText();	
	
           System.out.println(text);
	}
}