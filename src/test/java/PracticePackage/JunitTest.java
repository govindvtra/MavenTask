package PracticePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {

	@Test
	public void test() {
		PracticeClass obj = new PracticeClass();
		int res=obj.add(8, 9);
		assertEquals(17,res);
	}

}
