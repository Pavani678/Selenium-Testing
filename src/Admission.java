import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Admission {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo-hybrid.enterprisebot.co/65e99ad2716f67baad1966cf/iframe");
		driver.manage().window().maximize();
		
		WebElement aadhaarInput = driver.findElement(By.tagName("aadhaar"));
        WebElement Enter = driver.findElement(By.id("Enter"));

        // Sample Test case data
        String aadhaarNumber = "123456789012";

        // Enter data into input fields
        aadhaarInput.sendKeys(aadhaarNumber);

        // Click the submit button
        Enter.click();

        // Close the browser
        driver.quit();
				
	}
	}
		
	