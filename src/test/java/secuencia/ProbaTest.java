package secuencia;

/*
 * https://www.youtube.com/watch?v=2S6Mq-ylg3k
 * https://github.com/lucasmoy-dev/Java-Testing-Course/
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProbaTest {

	@InjectMocks
	private Proba proba;

	@Mock
	Scanner scan;

	@Test
	public void batuketa() {
		when(scan.nextLine()).thenReturn("2");

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		proba.run();

		Assert.assertTrue(out.toString().contains("2a"));
	}

	

//	@ParameterizedTest
//	@DisplayName("Kateaketa parametrizatua ")
//	@CsvSource({ "2, 2a", "1, 1a", "100, 1000a" })
//	public void kateatuParametrizatuta(String valor1, String esperado) {
//		when(scan.nextLine()).thenReturn(valor1);
//	
//		ByteArrayOutputStream out = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(out));
//	
//		proba.run();
//	
//		Assert.assertTrue(out.toString().contains(esperado));
//	}

//	@ParameterizedTest
//	@DisplayName("Test parametrizatua")
//	@CsvFileSource(resources = "datos.csv")
//	public void kateatuParametrizatuta(int valor1) {
//		when(scan.nextLine()).thenReturn("2");
//
//		ByteArrayOutputStream out = new ByteArrayOutputStream();
//		System.setOut(new PrintStream(out));
//
//		proba.run();
//
//		Assert.assertTrue(out.toString().contains("2a"));
//	}

}
