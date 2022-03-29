package org.sanitizer;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sanitizer {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclips\\Seleniumday10\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement sanitizer = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		
		sanitizer.sendKeys("HAnd Sanitizer");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.findElement(By.xpath("//img[@src='https://n3.sdlcdn.com/imgs/j/c/y/230X258_sharpened/VLCC-Hand-Sanitizer-500-mL-SDL242662448-1-2c92e.webp']")).click();
		String paraentId = driver.getWindowHandle();
		Set<String> AllwindowId = driver.getWindowHandles();
	    List<String> li=new ArrayList<String>();
	    li.addAll(AllwindowId);
	    driver.switchTo().window(li.get(1));
	    driver.findElement(By.xpath("(//span[@class='intialtext'])[1]")).click();
		
	}
}
