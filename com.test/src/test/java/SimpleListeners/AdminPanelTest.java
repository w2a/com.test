package SimpleListeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AdminPanelTest {
	
	@Test
	public void doLogin(){
			
	}
	
	
	
	@Test
	public void fillForm(){
		System.out.println("starting");
		Assert.fail();
		System.out.println("validating data in a form");
	}
	
	@Test
	public void validateData(){
		
		
		throw new SkipException("Skipping the Test");
	}
	
	
	

}
