package br.ufal.ic.testingtools.stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({DesktopTests.class, MainFrameTests.class})
public class StackTest {
	
	private static final int INT_1 = 1;
	private static final int INT_2 = 2;
	private static final Integer INTEGER_2 = new Integer(2);
	private static final Integer INTEGER_18 = new Integer(18);
	private static final Integer INTEGER_22 = new Integer(22);
	
	private static final String MSG_THE_INITIAL_STACK_IS_NOT_EMPTY = "The initial stack is not empty";
	
	private Stack<Integer> stack;
	
	@Before
	public void setUp() {
		stack = new Stack<Integer>(INTEGER_2);
	}
	
	@Test
	public void testEmptyStack() {
		assertTrue(MSG_THE_INITIAL_STACK_IS_NOT_EMPTY, stack.empty());
	}
	
	@Test
	public void testPushElementNull() {
		stack.push(INTEGER_18);
		stack.push(null);
		
		assertEquals(INT_2, stack.size());
		assertNull(stack.peek());
	}
	
	@Test
	public void testPush() {
		stack.push(INTEGER_18);
		stack.push(INTEGER_22);

		assertEquals(INT_2, stack.size());
		assertSame(INTEGER_22, stack.pop());
		assertSame(INTEGER_18, stack.pop());
	}
	
	@Test(expected = OverFlowStackException.class)
	public void testPushOverFlow() {
		stack.push(INTEGER_18);
		stack.push(INTEGER_18);	
		stack.push(INTEGER_18);
	}
	
	@Test
	public void testPeek() {
		stack.push(INTEGER_22);
		stack.push(INTEGER_18);

		Integer element = stack.peek();
		
		assertSame(INTEGER_18, element);
		assertEquals(INT_2, stack.size());
	}
	
	@Test
	public void testPeekUnderflowStack() {
		assertEquals(0, stack.size());
		try {
			stack.peek();
			fail("Stack underflow does not work.");
		} catch (UnderflowStackException e) {
			assertEquals("Underflow", e.getMessage());
		}
	}
	
	@Test
	public void testPop() {
		stack.push(INTEGER_18);
		stack.push(INTEGER_22);
		assertEquals(INT_2, stack.size());

		Integer element = stack.pop();
		
		assertSame(INTEGER_22, element);
		assertEquals(INT_1, stack.size());
		assertSame(INTEGER_18, stack.peek());
	}
	
	@Test(expected = RuntimeException.class)
	public void testPopEmptyStack() {
		assertNull(stack.pop());
	}
	
	@After
	public void tearDown() {
		stack = null;
	}

}
