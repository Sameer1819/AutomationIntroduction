import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileCartAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1819s\\Documents\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//div[@class='form-check-inline']/label[2]/span[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("okayBtn")).click();
		WebElement DD = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select StaticDD = new Select(DD);
		StaticDD.selectByIndex(1);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='navbar-brand']")));
		String[] itemsNeeded = {"iphone","Samsung","Blackberry"};
		List<WebElement> items = driver.findElements(By.xpath("//h4[@class='card-title']/a"));
		for(int i=0; i<items.size();i++)
		{
			String[] name= driver.findElements(By.xpath("//h4[@class='card-title']/a")).get(i).getText().split(" ");
			String formattedName = name[0].trim();
			List itemsRequired = Arrays.asList(itemsNeeded);
			if(itemsRequired.contains(formattedName))
			{
				
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
			}
		}
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
				
		
		
		
	}

}
