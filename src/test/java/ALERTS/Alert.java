package ALERTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert {
   public  static WebDriver driver;
	
	
	@Test(priority=1)
  public void login() throws Exception {
		  driver.findElement(By.name("username")).sendKeys("admin");
		  Thread.sleep(2000);
		  driver.findElement(By.name("password")).sendKeys("admin");
		  Thread.sleep(2000);
    	  driver.findElement(By.name("submit")).click();
	}
	@Test(priority=2)
	public void registraton() throws Exception {
		driver.findElement(By.linkText("Registration")).click();
		  new Select(driver.findElement(By.name("PATIENT_CAT"))). selectByIndex(2);
		  new Select(driver.findElement(By.name("TITLE"))). selectByIndex(1);
		  driver.findElement(By.name("PNT_NAME")).sendKeys("ramesh");
		  driver.findElement(By.name("MIDDLE_NAME")).sendKeys("kumar");
		  driver.findElement(By.name("LAST_NAME")).sendKeys("patel");
		  driver.findElement(By.name("DOB")).sendKeys("17-07-1992");
		  driver.findElement(By.name("AGE")).sendKeys("27");
		  new Select(driver.findElement(By.name("SEX"))). selectByIndex(1);
		  new Select(driver.findElement(By.name("RELIGION"))). selectByIndex(1);
		  new Select(driver.findElement(By.name("MTRL_STATUS"))). selectByIndex(1);
		  new Select(driver.findElement(By.name("PLANGUAGE"))). selectByIndex(1);
		  new Select(driver.findElement(By.name("RELATION"))). selectByIndex(1);
		  driver.findElement(By.name("MOTHER_NAME")).sendKeys("maidam");
		  new Select(driver.findElement(By.name("PAT_IDENTITY"))). selectByIndex(1);
		 	  driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("NVT1971985");
		  new Select(driver.findElement(By.name("NATIONALITY"))). selectByIndex(1);
		  new Select(driver.findElement(By.name("IS_MLC"))). selectByIndex(1);
		  new Select(driver.findElement(By.name("EDUCATION"))). selectByIndex(1);
		  new Select(driver.findElement(By.name("OCCUPATION"))). selectByIndex(2);
		  new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))). selectByIndex(3);
		  new Select(driver.findElement(By.name("CITIZENSHIP"))). selectByIndex(2);
		  new Select(driver.findElement(By.name("SC_PROOF"))). selectByIndex(2);
		  driver.findElement(By.name("ADDRESS1")).sendKeys("kukatpally");
		  driver.findElement(By.name("MOBILE_NO")).sendKeys("9010107969");
		  driver.findElement(By.name("EMAIL_ID")).sendKeys("RA@GMAIL.COM");
		  new Select(driver.findElement(By.name("COUNTRY_CODE"))). selectByIndex(1);
		  Thread.sleep(2000);
		  driver.findElement(By.name("ADDRESS2")).sendKeys("KPHB");
		  driver.findElement(By.name("ZIP")).sendKeys("500037");
		  driver.findElement(By.name("image")).sendKeys("D:\\image.jfif");
		  driver.findElement(By.name("submit")).click();
		  Thread.sleep(5000);
		  
		 String str;
	     str = driver.switchTo().alert().getText();
	     System.out.println(str);
	 	 driver.switchTo().alert().accept();
			
			
			//driver.switchTo().alert().accept();
			Thread.sleep(2000);
			
		}
		
		
 
	
		@BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("http://selenium4testing.com/hms");
		  
  
	
	}

	
	
	
	
 
	@AfterTest
  public void afterTest() {
  }

}
