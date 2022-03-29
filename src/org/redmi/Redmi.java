package org.redmi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redmi {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclips\\Seleniumday10\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/ ");
        WebElement redmi = driver.findElement(By.xpath("//input[@type='text']"));
         redmi.sendKeys("Redmi phone");
         
         Thread.sleep(5000);
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("(//img[@src='https://rukminim1.flixcart.com/image/312/312/kesv0y80/mobile/w/g/r/mi-redmi-9a-b08696xb4b-original-imafve7pjpemhwk5.jpeg?q=70'])[1]")).click();
       String ParentId = driver.getWindowHandle();
       System.out.println(ParentId);
       
       Set<String> AllwindowId = driver.getWindowHandles();
       List<String> li=new ArrayList<String>();
       li.addAll(AllwindowId);
       driver.switchTo().window(li.get(1));
       WebElement price = driver.findElement(By.xpath("(//div[text()='₹7,739'])[1]"));
         String text = price.getText();    
         
         System.out.println(text);

}
}