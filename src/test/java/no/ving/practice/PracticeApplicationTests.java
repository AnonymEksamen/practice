package no.ving.practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void failingTest() {
		boolean x = false;

		assertEquals(true, x);
	}

}

