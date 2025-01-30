package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateCheckbox {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement basiccheck = driver.findElement(By.className("ui-chkbox-label"));
		basiccheck.click();
		
					
		WebElement notify = driver.findElement(By.xpath("//span[contains(text(),'Ajax')]"));
		notify.click();
		
		WebElement lang = driver.findElement(By.xpath("//label[text()='Python']"));
		lang.click();
		
		
	WebElement tristate = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']//div[contains(@class,'ui-chkbox-box')]"));
	tristate.click();			
	 
		WebElement toggleswitch = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
	 if (!toggleswitch.isSelected()) {
		toggleswitch.click();
	 }				
	 
	 //verify toggle switch
	 //if(toggleswitch.isSelected()) {
		// System.out.println("Toggle is ON");
	 //}
	// else {System.out.println("Toggle is OFF");
	 //}
	 	 
	 //if checkbox is disabled
	 
	 WebElement checkbox = driver.findElement(By.id("j_idt87:j_idt102"));
	 
	 boolean isCheckboxDisabled =checkbox.getAttribute("disbled")!=null;
	 if(isCheckboxDisabled) {
		 System.out.println("The Checkbox is disabled");
	 }
	 else {
		 System.out.println("The Checkbox is enabled");
	 }
	 
	 }

}
