import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1819s\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//Actions a = new Actions(driver);
		//WebElement source = driver.findElement(By.xpath("//frameset[@name='frameset-middle']"));
		//WebElement target = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
	}

}
