package probak;

import static org.mockito.Mockito.when;

/*
 * https://www.youtube.com/watch?v=2S6Mq-ylg3k
 * https://github.com/lucasmoy-dev/Java-Testing-Course/
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import probak.Proba;

@RunWith(MockitoJUnitRunner.class)
public class ProbaTest {

	
	@InjectMocks
	private Proba proba;

	@Mock
	Scanner scan;

	@Test
	public void batuketaTest() {
		when(scan.nextLine()).thenReturn("2");

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		proba.run();

		Assert.assertTrue(out.toString().contains("2a"));
	}



}
