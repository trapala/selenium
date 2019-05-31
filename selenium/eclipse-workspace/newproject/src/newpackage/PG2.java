package newpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class PG2 {


    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\lab\\Documents\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  String baseUrl = "http://demo.guru99.com/v1/index.php";
		  driver.get(baseUrl);
		  
		  // 1. -----------------
	        WebElement UserName = driver.findElement(By.name ("uid"));
	        UserName.sendKeys("mngr198654");
	        
	      // 2. -----------------
	        WebElement password = driver.findElement(By.name ("password"));
	        password.sendKeys ("hYpYjut");
	        
	        driver.findElement(By.name("btnLogin")).submit();
	       
    }
}