package variousConcept;



//import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
  
//	Scanner scn = new Scanner(System.in);
	System.setProperty("Webdriver.chrome.driver", "driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
    driver.manage().window().maximize();
//    driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();



}
}