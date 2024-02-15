package myProjectTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import helloWorld.Hello;

public class MyAppTest {
	@Test
	public void testApp() {
		Hello objHello=new Hello();
		String result = objHello.printMessage();
		assertEquals("Hello", result);
		//Expected result, Generated Result
	}

}
