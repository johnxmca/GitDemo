package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@SmokTest")
	public void test()
	{
		System.out.println("Smokinnu munbu");
	}
	
	

	@After("@SmokTest")
	public void test1()
	{
		System.out.println("Smokinnu pinmbu");
	}

}
