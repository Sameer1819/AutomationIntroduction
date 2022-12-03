import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1819s\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(5000);
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//select[contains(@id,'originStation1')]")).click();
		driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_originStation1\']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='IXM'])[2]")).click();
		driver.findElement(By.xpath("//div[@id=\'glsctl00_mainContent_ddl_destinationStation1_CTNR\']//a[@value='TRV']")).click();
	}

}
