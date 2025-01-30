package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.telerik.com/contact");
		
		WebElement ot = driver.findElement(By.id("Dropdown-1"));
		Select Options = new Select (ot);
		Options.selectByVisibleText("General Inquiries");
		
		WebElement oi = driver.findElement(By.id("Dropdown-2"));	
		Select Optioni = new Select (oi);
		Optioni.selectByIndex(10);
	
    WebElement ov = driver.findElement(By.id("Country-1"));
    Select Optionv = new Select (ov);
    Optionv.selectByValue("Canada");
	
	}

}
