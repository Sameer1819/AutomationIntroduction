import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sellIntroduction {

	public static void main(String[] args) 
	{
		// Invoking browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1819s\\Documents\\chromedriver.exe");
		
		//chromebrowser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
