import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestiveDD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1819s\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("United");
		Thread.sleep(3000);
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[3]"))).click().build().perform();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value"));
		

	}

}
