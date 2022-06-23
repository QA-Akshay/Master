package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivision {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUN\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345366889");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alt =driver.switchTo().alert();
		alt.accept();
		
	}

}
