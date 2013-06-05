import junit.framework.Assert;

import org.junit.Test;


public class HelloTest {

	@Test
	public void helloTest(){
		
		Hello hello = new Hello();
	
		Assert.assertEquals("Hello me!", hello.toString());
	}

}
