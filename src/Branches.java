import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Branches {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo-hybrid.enterprisebot.co/65e99ad2716f67baad1966cf/iframe");
		driver.manage().window().maximize();
	    WebElement branchesList = driver.findElement(By.tagName("branches"));
	    System.out.println(branchesList.isDisplayed());
	    driver.quit();
	        
	    }
	}
	
		
		
	
	