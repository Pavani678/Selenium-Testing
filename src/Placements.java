import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Placements {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo-hybrid.enterprisebot.co/65e99ad2716f67baad1966cf/iframe");
		WebElement placementInformation = driver.findElement(By.tagName("placementInformation"));
		System.out.println(placementInformation.isDisplayed());
		driver.quit();	   
		}
	}


