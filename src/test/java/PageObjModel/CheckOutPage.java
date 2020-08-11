package PageObjModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
	
	public WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	

	public WebElement checkProductName()
	{
		WebElement searchElt= driver.findElement(By.xpath("//p[@class='product-name']"));
		return searchElt;
	}
}
