import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import prop.readProperties;

class test2 {

	@Test  //opening rewars Join now page
	
	public void site_header_is_on_home_page() {

		
		readProperties rp = new readProperties();
       
		System.setProperty("webdriver.chrome.driver",rp.getDriverPath());
		
        WebDriver browser = new ChromeDriver();
        
        browser.get(rp.getApplicationUrl());
        
        WebElement href = browser.findElement(By.xpath("//a[@href='https://www.woolworthsrewards.com.au/register_single.html']"));
    
        assertTrue((href.isDisplayed()));
   
        browser.close();
   
        browser.quit();
  
	
	}

}
