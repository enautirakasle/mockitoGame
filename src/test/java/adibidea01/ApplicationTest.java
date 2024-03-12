package adibidea01;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {
	@InjectMocks
	MainClass mainClass;

	@Mock
	DatabaseDAO dependentClassOne;

	@Mock
	NetworkDAO dependentClassTwo;

	@Before
	public void init() {
//		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void validateTest()
	{
                //record expectations with mock methods
                when(dependentClassOne.save("fitxategia.txt")).thenReturn(true);
                when(dependentClassTwo.save("fitxategia.txt")).thenReturn(true);

		boolean saved = mainClass.save("temp.txt");
		assertEquals(true, saved);

                //verify recorded expectations
	}

}
