import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxAndAssertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1819s\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 3);//if any value other than 3 then code will fail in this step
		Assert.assertFalse(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		System.out.println("This will be printed for AssertFalse");
		Assert.assertTrue(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		System.out.println("This will not be printed for AssertTrue");
		

	}

}
