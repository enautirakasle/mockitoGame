/*
 * https://www.youtube.com/watch?v=2S6Mq-ylg3k
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {
	
	@InjectMocks
	private Game game;
	
	@Mock
	Scanner scanner;
	
	@Test
	public void when_IwriteQuit_then_exitGame() {
		Mockito.when(scanner.nextLine()).thenReturn("Quit");
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		game.play();
		
		Assert.assertTrue(out.toString().contains("Let's play Rock"));
	}

}
