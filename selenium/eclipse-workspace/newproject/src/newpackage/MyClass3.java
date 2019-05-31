package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass3 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\rapal\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.popuptest.com/popuptest2.html");
        driver.quit();  // using QUIT all windows will close
    }
}
