package probak;

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

import probak.EjercicioProba;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EjercicioProbaTest {


	@InjectMocks
	private EjercicioProba ejercicioProba;

	@Mock
	Scanner scanner;


	@Test
	public void batuketaTest() {
		when(scanner.nextLine()).thenReturn("2", "7");

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		ejercicioProba.run();

		Assert.assertTrue(out.toString().contains("9"));
//		Assert.assertFalse(out.toString().contains("Hola Mundo!"));
	}



}
