package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
 
		
		ChromeDriver driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");

		WebElement passWord = driver.findElement(By.id("pass"));
		passWord.sendKeys("Tuna@321");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Find your account and log in."));
			
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
