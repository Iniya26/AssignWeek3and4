package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// Select Class for handling drop down
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		
//handling drop down select class is required
//first need to create web element for select class - as options are listed from select
//driver.findElement(By.className("ui-selectonemenu"); ctrl+2 -local variable to create web element
		
	WebElement dd = driver.findElement(By.className("ui-selectonemenu"));

//creat object for select class	\\select class should be imported from selenium support ui
	
	Select options=new Select(dd);
	
//call the methos-most preferred select is 1-visible text if dupli then 2.value else index
	//index always starts from 0
	options.selectByIndex(3);
	//options.selectByVisibleText("Selenium");
	//options.deselectByValue("Aerospace");
	
	//if Select tag is not present then how to proceed -normal click action
	//driver.findElement(By.id(value)).click();
	
	
	
	

	}

}
