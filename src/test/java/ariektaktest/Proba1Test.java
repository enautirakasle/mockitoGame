/**
 * 
 */
package ariektaktest;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import adibideak.Proba1;

/**
 * @author Eñaut Agirre
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class Proba1Test {

	@InjectMocks
	private Proba1 proba;

	@Mock
	Scanner scanner;
	

	@Test
	public void testMain() {
		when(scanner.nextLine()).thenReturn("10").thenReturn("1");
		

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		proba.run();
		
		Assert.assertTrue(out.toString().contains("11"));
		
	}

}
