package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookSelectClass {

	public static void main(String[] args) {
		
    ChromeDriver driver=new ChromeDriver();
   
    driver.manage().window().maximize();
    
    driver.get("https://en-gb.facebook.com/");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
    WebElement account = driver.findElement(By.xpath("//a[text()='Create new account']"));
    account.click();		
    		
    WebElement firstname = driver.findElement(By.name("firstname"));
    firstname.sendKeys("John");
    
    WebElement surname = driver.findElement(By.name("lastname"));
    surname.sendKeys("David");
    		
    WebElement birthday = driver.findElement(By.id("day"));
    birthday.sendKeys("26");
    		
    WebElement birthmth = driver.findElement(By.id("month"));
    birthmth.sendKeys("Mar");
    	
    WebElement birthyr = driver.findElement(By.id("year"));
    birthyr.sendKeys("1996");
    
    WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
    gender.click();    
	
    WebElement email = driver.findElement(By.name("reg_email__"));
    email.sendKeys("johndavid7000@gmail.com");
    
    WebElement fbpass = driver.findElement(By.name("reg_passwd__"));
    fbpass.sendKeys("john@7000");
    
    WebElement signupsub = driver.findElement(By.name("websubmit"));
    signupsub.click();
	
	}

}
