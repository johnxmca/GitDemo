package HooksSearch;

import Base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksSearch extends Base{
	
	@Before("@SelTest")
	public void test()
	{
		System.out.println("Sel testinnu munbu");
	}
	
	

	@After("@SelTest")
	public void test1()
	{
		driver.close();
	}

}
