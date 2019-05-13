import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		/*
		//tagName[@attribute='value']  - xpath
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("My own xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		*/
		
		 /*
	    tagName[attribute='value']   -CSS
	    */
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("my own cass");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		
	}
	
	  
	
		

}
