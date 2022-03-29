package org.iphonex;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphonex {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclips\\Seleniumday10\\driver\\chromedriver.exe");
	
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();  
	    driver.get("https://www.snapdeal.com/");
	    WebElement searchbox = driver.findElement(By.id("inputValEnter"));
	    searchbox.sendKeys("iphones7");
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
	    driver.findElement(By.xpath("//img[@src='https://n2.sdlcdn.com/imgs/j/r/c/230X258_sharpened/Apple-Iphone-7-Hybrid-Covers-SDL159887573-1-e343c.webp']")).click();
	    
	   String parentId = driver.getWindowHandle();
	   Set<String> allwindowId = driver.getWindowHandles();
	    List<String>  li=new ArrayList<String>();
	   li.addAll(allwindowId);
	    driver.switchTo().window(li.get(1));
	    driver.findElement(By.id("add-cart-button-id")).click();
	    Thread.sleep(5000);
	   WebElement price = driver.findElement(By.xpath("(//span[@class='price'])[2]"));  
	    String text = price.getText();
        System.out.println(text);   	
	
	}

}
