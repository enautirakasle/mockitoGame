package matematika;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.Assert;


import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class KalkulagailuTest {
	
	@InjectMocks
	private Kalkulagailu kalk;
	
	@Mock
	Scanner scanner;
	
	@Test
	public void when_scan45_then_print9() {
		when(scanner.nextLine()).thenReturn("10").thenReturn("1");
		

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		kalk.batu();
		
//		Assert.assertTrue(Integer.parseInt(out.toString().substring(0, 2)) ==11);
		Assert.assertTrue(out.toString().equals("11\n"));
		
	}
	
//	@Test
//	public void kateatuTest() {
//		when(scanner.nextLine()).thenReturn("kaixo");
//		
//		ByteArrayOutputStream out = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(out));
//		
//		kalk.kateatu();
//		
//		Assert.assertTrue(out.toString().contains("kai"));
//
//	}

}
