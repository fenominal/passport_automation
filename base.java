package passport_bhavesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public static WebDriver driver;
	public static WebElement filenumber;
	public static WebElement submitbutton;
//	public static SoftAssert softAssert;
	
	@BeforeTest
	public void base() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// make driver of the google chrome
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/testing/automationdemo/bhavesh_passport/Passportform.html");
		System.out.println("base");//open	
		
//		softAssert = new SoftAssert();
		filenumber = driver.findElement(By.id("filename"));
		submitbutton = driver.findElement(By.xpath("/html/body/div/div/form/div[14]/input[1]"));
		
			
	}
	
	
	@AfterTest
	public void exit() {		
		System.out.println("Close browser");
		driver.close();
	}
}
