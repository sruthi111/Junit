import static org.junit.Assert.*;
import com.Epam.Junit.RemoveFirstTwoAs;
public class Test {
	RemoveFirstTwoAs obj;
	@org.junit.Before
	public void Before(){
		obj = new RemoveFirstTwoAs();
	}
	@org.junit.Test
	public void testFirstChar() {
		/* ABCD-->BCD */
		assertEquals("BCD", obj.RemoveA("ABCD"));
	}
	@org.junit.Test
	public void testSecondChar() {
		/* BACD-->BCD */
		assertEquals("BCD", obj.RemoveA("BACD"));
	}
	@org.junit.Test
	public void testFirstTwoChars1() {
		/* BBCD-->BBCD */
		assertEquals("BBCD", obj.RemoveA("BBCD"));
	}
	@org.junit.Test
	public void testFirstTwoChars2() {
		/* AABD-->BD*/
		assertEquals("BD", obj.RemoveA("AABD"));
	}
	@org.junit.Test
	public void testFirstTwoChars3() {
		/* AABAA-->BAA */
		assertEquals("BAA", obj.RemoveA("AABAA"));
	}

}
