package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public static WebDriver getDriverDetails() throws IOException{
	
		Properties p1 = new Properties();

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\env.properties");
		p1.load(fis);
		

		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p1.getProperty("url"));
		return driver;
	}

}
