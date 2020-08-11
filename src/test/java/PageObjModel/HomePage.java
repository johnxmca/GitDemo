package PageObjModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement findSearch()
	{
		WebElement searchElt= driver.findElement(By.xpath("//input[@type='search']"));
		return searchElt;
	}
	
	public WebElement checkProdName()
	{
		WebElement searchElt= driver.findElement(By.xpath("//h4[@class='product-name']"));
		return searchElt;
	}
	
	
	public WebElement addToCart()
	{
		WebElement searchElt= driver.findElement(By.xpath("//button[contains(.,'ADD TO CART')]"));
		return searchElt;
	}

	

	public WebElement cartIconClick()
	{
		WebElement searchElt= driver.findElement(By.xpath("//img[@alt='Cart']"));
		return searchElt;
	}
	

	public WebElement ProceedtoCheckOutClick()
	{
		WebElement searchElt= driver.findElement(By.xpath("//button[contains(.,'PROCEED TO CHECK')]"));
		return searchElt;
	}
}
