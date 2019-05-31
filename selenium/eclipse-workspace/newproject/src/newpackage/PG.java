package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class PG {


    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	// System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
     	System.setProperty("webdriver.chrome.driver","C:\\Users\\lab\\Documents\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        // 1. -----------------
        WebElement UserName = driver.findElement(By.name ("userName"));
        UserName.clear();
        UserName.sendKeys("TEST1");
        
        // 2. -----------------
        WebElement UserRegister = driver.findElement(By.partialLinkText ("Register"));
        UserRegister.click ();
        // 2.1 ----------------
        WebElement firstname = driver.findElement(By.name ("firstName"));
        firstname.sendKeys ("ALFA");
        WebElement lastname = driver.findElement(By.name ("lastName"));
        lastname.sendKeys ("BETA");
        
        // --------------
        
        WebElement email = driver.findElement(By.name ("email"));
        email.sendKeys ("EMAIL");
        
        WebElement password = driver.findElement(By.name ("password"));
        password.sendKeys ("EMAIL");
        
        WebElement confirmPassword = driver.findElement(By.name ("confirmPassword"));
        confirmPassword.sendKeys ("EMAIL");
        
        
        driver.wait (50,0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //close Fire fox
        driver.close();
       
    }

}