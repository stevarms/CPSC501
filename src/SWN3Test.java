import static org.junit.Assert.*;
import org.junit.Test;


public class SWN3Test {
	
	@Test
	public void test_extract_very_strong_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("perked_up","a");
		assertTrue(test == "very_strong_positive");
	}
	@Test
	public void test_extract_strong_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("saintly","a");
		assertTrue(test == "strong_positive");
	}
	@Test
	public void test_extract_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("good","a");
		assertTrue(test == "positive");
	}
	@Test
	public void test_extract_weak_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("due","a");
		assertTrue(test == "weak_positive");
	}
	@Test
	public void test_extract_Neutral() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("anadromous","a");
		assertTrue(test == "neutral");
	}
	@Test
	public void test_extract_weak_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("landscape","n");
		assertTrue(test == "weak_negative");
	}
	@Test
	public void test_extract_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("bad","a");
		assertTrue(test == "negative");
	}
	@Test
	public void test_extract_strong_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("terrible","a");
		assertTrue(test == "strong_negative");
	}
	@Test
	public void test_extract_very_strong_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.extract("uncool","a");
		assertTrue(test == "very_strong_negative");
	}
	@Test
	public void test_sentiment_very_strong_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(1.0);
		assertTrue(test == "very_strong_positive");
	}
	@Test
	public void test_sentiment_strong_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(0.74);
		assertTrue(test == "strong_positive");
	}
	@Test
	public void test_sentiment_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(0.49);
		assertTrue(test == "positive");
	}
	@Test
	public void test_sentiment_weak_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(0.24);
		assertTrue(test == "weak_positive");
	}
	@Test
	public void test_sentiment_Neutral() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(0);
		assertTrue(test == "neutral");
	}
	@Test
	public void test_sentiment_weak_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(-0.24);
		assertTrue(test == "weak_negative");
	}
	@Test
	public void test_sentiment_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(-0.49);
		assertTrue(test == "negative");
	}
	@Test
	public void test_sentiment_strong_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(-0.74);
		assertTrue(test == "strong_negative");
	}
	@Test
	public void test_sentiment_very_strong_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(-1.0);
		assertTrue(test == "very_strong_negative");
	}
	@Test
	public void test_sentiment_below_bounds() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(-1.1);
		assertFalse(test == "very_strong_negative");
	}
	@Test
	public void test_sentiment_above_bounds() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(1.1);
		assertFalse(test == "very_strong_positive");
	}
	@Test
	public void test_sentiment_not_very_strong_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(0);
		assertFalse(test == "very_strong_positive");
	}
	@Test
	public void test_sentiment_not_strong_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(0);
		assertFalse(test == "strong_positive");
	}
	@Test
	public void test_sentiment_not_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(0);
		assertFalse(test == "positive");
	}
	@Test
	public void test_sentiment_not_weak_positive() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(0);
		assertFalse(test == "weak_positive");
	}
	@Test
	public void test_sentiment_not_Neutral() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(1.0);
		assertFalse(test == "neutral");
	}
	@Test
	public void test_sentiment_not_weak_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(0);
		assertFalse(test == "weak_negative");
	}
	@Test
	public void test_sentiment_not_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(0);
		assertFalse(test == "negative");
	}
	@Test
	public void test_sentiment_not_strong_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(0);
		assertFalse(test == "strong_negative");
	}
	@Test
	public void test_sentiment_not_very_strong_negative() {
		SWN3 myswn = new SWN3();
		String test = myswn.getSentiment(0);
		assertFalse(test == "very_strong_negative");
	}
	
}
