package ALERTS;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Popup {

	public WebDriver driver;
	
  @Test
  public void Login() throws Exception {
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	   
	   //Clicking on Feedback button
	  driver.findElement(By.xpath("//a[text()='Feedback']")).click();
	 
	  
	// Store the current window handle ***Acts as a Ladder***
	  String winHandleBefore = driver.getWindowHandle();
	  
	  
	  
	  // Switch to new window opened
	  for(String winHandle : driver.getWindowHandles()){
	      driver.switchTo().window(winHandle);
	  }

		Thread.sleep(2000);
		driver.manage().window().maximize();	

	  Thread.sleep(2000);
	 
       driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Sitara");

       driver.findElement(By.id("email")).sendKeys("selenium@gmail.com");
		
		new Select(driver.findElement(By.id("car"))).selectByVisibleText("Volvo");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/label/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[6]/input")).sendKeys("C:\\Users\\Ramesh\\Desktop\\image.jfif");
		
		driver.findElement(By.id("message")).sendKeys("Sitara IS A CRAZY GIRL");
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/p/button[1]")).click();
		
		Thread.sleep(5000);
		  
		driver.findElement(By.id("close")).click();
		Thread.sleep(3000);
		
	//Switch back to original browser (first window)
     
		driver.switchTo().window(winHandleBefore);
      
		Robot robot = new Robot();
		//Robot robot = new Robot();
		System.out.println("About to zoom in");
		for (int i = 0; i < 3; i++) {			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(5000);
		System.out.println("About to zoom out");
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
	}
}
		//Thread.sleep(5000);		
	     driver.findElement(By.linkText("Registration")).click();
	 

		
			

		
  
  
  @BeforeTest
  public void beforeTest() {
	  
	//  System.setProperty("webdriver.chrome.driver", "H:\\lib\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://selenium4testing.com/hms");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  //ChromeOptions co = new ChromeOptions();
	  //co.addArguments("Dissable Notifications");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
