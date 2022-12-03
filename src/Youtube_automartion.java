import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_automartion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1819s\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String song = getSongName(driver);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		//driver.findElement(By.id("logo-icon"));
		//driver.findElement(By.name("search_query")).sendKeys("Tum hi ho");
		//driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//yt-formatted-string[contains(@aria-label,'Tum')]")).click();
		driver.findElement(By.xpath("//tp-yt-paper-button[@aria-label='Sign in']")).click();
		//driver.findElement(By.xpath("//tp-yt-paper-button[@aria-label='Sign in']")).click();
		driver.findElement(By.xpath("//input[@type=\'email\']")).sendKeys(song+"@gmail.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.youtube.com");
		driver.navigate().back();
		
	}
	
	public static String getSongName(WebDriver driver) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com");
		driver.findElement(By.id("logo-icon"));
		driver.findElement(By.name("search_query")).sendKeys("Tum hi ho");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(1000);
		String songText = driver.findElement(By.xpath("//yt-formatted-string[contains(@aria-label,'Tum')]")).getText();
		String[] songSplit = songText.split("Full");
		String song = songSplit[0];
		return song;
	}

}
