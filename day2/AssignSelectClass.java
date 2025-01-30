package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignSelectClass {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();		

		driver.findElement(By.linkText("CRM/SFA")).click();
		
        driver.findElement(By.linkText("Accounts")).click();

		driver.findElement(By.linkText("Create Account")).click();
		  
	    driver.findElement(By.id("accountName")).sendKeys("Iniyasps");
		   
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");

		WebElement si = driver.findElement(By.name("industryEnumId"));
		
		Select industry=new Select(si);
		industry.selectByIndex(3);
		
	    
        WebElement os = driver.findElement(By.name("ownershipEnumId"));
		
		Select ownership=new Select(os);
		ownership.selectByVisibleText("S-Corporation");
		
        WebElement st = driver.findElement(By.id("dataSourceId"));
		
		Select source=new Select(st);
		source.selectByValue("LEAD_EMPLOYEE");
		
        WebElement mc = driver.findElement(By.id("marketingCampaignId"));
		
		Select marketcamp=new Select(mc);
		marketcamp.selectByIndex(6);
		
        WebElement sp = driver.findElement(By.id("generalStateProvinceGeoId"));
		
		Select statepro=new Select(sp);
		statepro.selectByValue("TX");
		
	    driver.findElement(By.className("smallSubmit")).click(); 

	    String title = driver.getTitle();
	    System.out.println(title);
	
	//    driver.close();

	}

}
