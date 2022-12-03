import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAndParsindStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1819s\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		System.out.println(driver.findElements(By.xpath("//table/tbody/tr/th")).size());
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		System.out.println(Integer.parseInt(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[4]/td[3]")).getText()));

	}

}
