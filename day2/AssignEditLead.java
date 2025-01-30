package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.core.backend.Options;

public class AssignEditLead {

	public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	
	WebElement passWord = driver.findElement(By.id("password"));
	passWord.sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();	
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Create Lead")).click();
    
	WebElement compname = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
	compname.sendKeys("testleaf");
	
	WebElement firstname = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
	firstname.sendKeys("john");
	
	WebElement lastname = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
	lastname.sendKeys("peter");
	
	WebElement firstlo = driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"));
	firstlo.sendKeys("Peter");
	
	WebElement deprt = driver.findElement(By.xpath("//input[contains(@id,'departmentName')]"));
	deprt.sendKeys("IT");	
	
	WebElement descr = driver.findElement(By.xpath("//textarea[contains(@id,'description')]"));
	descr.sendKeys("Auto tester");
	
	WebElement Emailofs = driver.findElement(By.xpath("//input[contains(@id,'primaryEmail')]"));
	Emailofs.sendKeys("johndavid7000@gmail.com");
	
    WebElement staprv = driver.findElement(By.name("generalStateProvinceGeoId"));	
    Select Option3 = new Select(staprv);
	Option3.selectByVisibleText("New York");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	driver.findElement(By.linkText("Edit")).click();
	
	WebElement cleardes = driver.findElement(By.name("description"));
	cleardes.clear();
	
	
	
	
	}

}
