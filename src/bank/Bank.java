package bank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bank {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUN\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Akshay");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Gaikwad");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("8888888");
         Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("India");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("Aurangabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("akshayGaikwad@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']")).click();
	    Thread.sleep(2000);	
		driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_0']")).click();
		Thread.sleep(2000);	
        WebElement dropdown=driver.findElement(By.id("RESULT_RadioButton-9"));
		Select s=new Select(dropdown);
		s.selectByValue("Radio-0");	
		
		
		Thread.sleep(2000);
		driver.findElement(By.className("inline_answer")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("E:\\automation\\desktop\\fileupload86.exe");//will execute AutoIT tool
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		Set<String>ids=driver.getWindowHandles();
		ArrayList al=new ArrayList(ids);
		System.out.println(al.get(0));
		
		//driver.switchTo().window((String) al.get(0));
		Thread.sleep(2000);
		driver.findElement(By.className("wikipedia-search-input")).sendKeys("Akshay");
		Thread.sleep(2000);
		driver.findElement(By.className("wikipedia-search-button")).click();
		Thread.sleep(2000);
		List<WebElement> lists=driver.findElements(By.linkText("Akshay Kumar"));
			System.out.println(lists);
			for(WebElement list :lists ) {
				String exp="Akshay Kumar";
				String act=list.getText();
				if(act.equals(exp)) {
					list.click();
					break;
				}
				
			}
	
	}

}
