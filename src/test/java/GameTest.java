
/*
 * https://www.youtube.com/watch?v=2S6Mq-ylg3k
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
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

	public static final int OPTION_ROCK = 0;
	public static final int OPTION_PAPER = 1;
	public static final int OPTION_SCISSORS = 2;

	@InjectMocks
	private Game game;

	@Mock
	Scanner scanner;

	@Mock
	Random random;

	@Test
	public void when_IwriteQuit_then_exitGame() {
		when(scanner.nextLine()).thenReturn("Quit");

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		game.play();

		Assert.assertTrue(out.toString().contains("Let's play Rock"));
	}

	@Test
	public void when_chooseRock_then_beatsScissors() {
		when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
		when(random.nextInt(3)).thenReturn(OPTION_SCISSORS);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		game.play();

		Assert.assertTrue(out.toString().contains("Computer chose scissors"));
		Assert.assertTrue(out.toString().contains("wins:1"));
	}

	@Test
	public void when_chooseScissors_then_beatsPaper() {
		when(scanner.nextLine()).thenReturn("Scissors").thenReturn("Quit");
		when(random.nextInt(3)).thenReturn(OPTION_PAPER);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		game.play();

		Assert.assertTrue(out.toString().contains("Computer chose paper"));
		Assert.assertTrue(out.toString().contains("wins:1"));
	}

	@Test
	public void when_choosePaper_then_beatsRock() {
		when(scanner.nextLine()).thenReturn("Paper").thenReturn("Quit");
		when(random.nextInt(3)).thenReturn(OPTION_ROCK);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		game.play();

		Assert.assertTrue(out.toString().contains("Computer chose rock"));
		Assert.assertTrue(out.toString().contains("wins:1"));
	}

	@Test
	public void when_bothChooseRock_then_tie() {
		when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
		when(random.nextInt(3)).thenReturn(OPTION_ROCK);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		game.play();

		Assert.assertTrue(out.toString().contains("Computer chose rock"));
		Assert.assertTrue(out.toString().contains("ties:1"));
	}

	@Test
	public void when_chooseRockAndComputerChoosePaper_then_loose() {
		when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
		when(random.nextInt(3)).thenReturn(OPTION_PAPER);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));

		game.play();

		Assert.assertTrue(out.toString().contains("Computer chose paper"));
		Assert.assertTrue(out.toString().contains("loses:1"));
	}

}
