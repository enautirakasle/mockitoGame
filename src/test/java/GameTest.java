/*
 * https://www.youtube.com/watch?v=2S6Mq-ylg3k
 */
import java.util.Scanner;

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
	public void gameTest() {
		Mockito.when(scanner.nextLine()).thenReturn("Quit");
//		Game game = new Game();
		game.play();
		
	}

}
