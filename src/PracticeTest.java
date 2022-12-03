import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1819s\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice");
		driver.findElement(By.name("name")).sendKeys("Sameer Agrawal");
		driver.findElement(By.name("email")).sendKeys("sameer@mail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Sameer@123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement DD = driver.findElement(By.id("exampleFormControlSelect1"));
		Select staticDD = new Select(DD);
		staticDD.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("20031996");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		String text = driver.findElement(By.xpath("/html/body/app-root/form-comp/div/div[2]/div/strong")).getText();
		Assert.assertEquals(text, "Success!");
		System.out.println("Test case is passed");
	}

}
