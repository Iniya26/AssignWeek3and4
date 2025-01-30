package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
//Chrome Driver should be import from ctrl_shift+o		
		ChromeDriver driver=new ChromeDriver();
		
//webpage maximize		
		driver.manage().window().maximize();
		
//weburl ctrl+space-1st option-copypaste the url		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
 //commom wait time of all the elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 
//to find locators and to assign value by sendkeys
//if mismatch attribute name or value then in console exception shows
		//and in web page value will not be shown		
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	
//return type of find element is web element -ctrl+2 -2ndoption-localvariable
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		
//click on login button
		
		driver.findElement(By.className("decorativeSubmit")).click();		

//link and partial link locators -give partial value
		
		driver.findElement(By.linkText("CRM/SFA")).click();
        //driver.findElement(By.partialLinkText("CRM/S")).click();
        
//print title of page - method called get title(); after ;ctrl+2-2ndoption
        //and default return type will be string  
       // String title = driver.getTitle();
        //System.out.println(title);
       //or title can be given as below 
       //System.out.println(driver.getTitle()); 
//click on Account tab
        driver.findElement(By.linkText("Accounts")).click();
//click on create account button
        driver.findElement(By.linkText("Create Account")).click();
 //enter account name
        driver.findElement(By.id("accountName")).sendKeys("IniyaTester");
 //enter the descr
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
        
 //enter the no of emp
        driver.findElement(By.name("numberEmployees")).sendKeys("1");
//enter site name
        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
        
//click on create account
       driver.findElement(By.className("smallSubmit")).click(); 
       
//check the title
       String title = driver.getTitle();
       System.out.println(title);
//java wait       
       Thread.sleep(3000);
//close the browser
driver.close();
	
	}
	

}
