package org.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclips\\Seleniumday10\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement iphone = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		iphone.sendKeys("iphone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		List<WebElement> Allprice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for (int i = 0; i < Allprice.size(); i++) {
			WebElement price = Allprice.get(i);
			System.out.println(price.getText());
			
		}
	}

}
