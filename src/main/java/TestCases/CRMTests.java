package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CRMTests {

	WebDriver driver;
	
	@Test
	public void crmTest() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
//		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='User Management']")).click();
		driver.findElement(By.xpath("//*[text()='Users']")).click();
		
		//Search User
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("User1");
		Thread.sleep(5000);
		
		// Emplouee Name 
		driver.findElement(By.xpath("(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[1]")).click();
		//driver.findElement(By.xpath("(//*[text()='Admin'])[3]")).click();
		driver.findElement(By.xpath("(//*[text()='ESS'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Navnath_Mahabale");
		//Status validation
		driver.findElement(By.xpath("(//*[@class=\"oxd-select-text--after\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Enabled'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type=\'submit\']")).click();
		Thread.sleep(2000);
		
		//************************************************************************************************************************		
		// Create New Contact
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-plus oxd-button-icon\"]")).click();
		Thread.sleep(2000);
		
		//User Roll
		driver.findElement(By.xpath("(//div[@class=\"oxd-select-text--after\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Admin'])[3]")).click();
		
		// Status
				driver.findElement(By.xpath("(//*[@class='oxd-select-text-input'])[2]")).click();
				driver.findElement(By.xpath("//*[text()='Enabled']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Navnath");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Admin@123");
				driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Admin@123");
				Thread.sleep(5000);
				// Employee Name
				driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("a");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class=\"oxd-autocomplete-option\"])[3]//span")).click();
				
		System.out.println("Test Case is Pass");
				
		
	}	
	
	@AfterTest
	public void quitTest() {
		
		driver.quit();
		
		
	}
	
}
