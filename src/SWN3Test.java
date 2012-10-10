import static org.junit.Assert.*;

import org.junit.Test;


public class SWN3Test {
	
	@Test
	public void test_very_strong_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("perked_up","a");
		assertTrue(test == "very_strong_positive");
	}
	@Test
	public void test_strong_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("saintly","a");
		assertTrue(test == "strong_positive");
	}
	@Test
	public void test_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("good","a");
		assertTrue(test == "positive");
	}
	@Test
	public void test_weak_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("due","a");
		assertTrue(test == "weak_positive");
	}
	@Test
	public void test_Neutral() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("anadromous","a");
		assertTrue(test == "neutral");
	}
	@Test
	public void test_weak_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("landscape","n");
		assertTrue(test == "weak_negative");
	}
	@Test
	public void test_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("bad","a");
		assertTrue(test == "negative");
	}
	@Test
	public void test_strong_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("terrible","a");
		assertTrue(test == "strong_negative");
	}
	@Test
	public void test_very_strong_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("uncool","a");
		assertTrue(test == "very_strong_negative");
	}
}
