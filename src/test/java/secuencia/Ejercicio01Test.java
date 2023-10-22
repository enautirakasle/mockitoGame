package secuencia;

/*
 * https://www.youtube.com/watch?v=2S6Mq-ylg3k
 * https://github.com/lucasmoy-dev/Java-Testing-Course/
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Ejercicio01Test {


	@InjectMocks
	private Ejercicio01 ejercicio01;

	@Mock
	Scanner scanner;

	@Test
	public void ok_ona_idaztean() {
		when(scanner.nextLine()).thenReturn("ona");

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		ejercicio01.run();

		Assert.assertTrue(out.toString().contains("Hola Mundo!"));
//		Assert.assertFalse(out.toString().contains("Hola Mundo!"));
	}



}
