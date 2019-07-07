package br.ufal.ic.testingtools.stack;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({DesktopTests.class, MainFrameTests.class})
public class StackTest {
	
	private static final Integer INTEGER_1 = new Integer(1);
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
		
		assertThat(INTEGER_2, is(stack.size()));
		assertThat(null, equalTo(stack.peek()));
	}
	
	@Test
	public void testPush() {
		stack.push(INTEGER_18);
		stack.push(INTEGER_22);

		assertThat(INTEGER_2, is(stack.size()));
		assertThat(INTEGER_22, is(stack.pop()));
		assertThat(INTEGER_18, is(stack.pop()));
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
		
		assertThat(INTEGER_18, is(element));
		assertThat(INTEGER_2, is(stack.size()));
	}
	
	@Test
	public void testPeekUnderflowStack() {
		assertEquals(0, stack.size());
		try {
			stack.peek();
			fail("Stack underflow does not work.");
		} catch (UnderflowStackException e) {
			assertThat("Underflow", equalTo(e.getMessage()));
		}
	}
	
	@Test
	public void testPop() {
		stack.push(INTEGER_18);
		stack.push(INTEGER_22);
		assertThat(INTEGER_2, is(stack.size()));

		Integer element = stack.pop();
		
		assertThat(INTEGER_22, is(element));
		assertThat(INTEGER_1, is(stack.size()));
		assertThat(INTEGER_18, is(stack.peek()));
	}
	
	@Test(expected = RuntimeException.class)
	public void testPopEmptyStack() {
		stack.pop();
	}
	
	@After
	public void tearDown() {
		stack = null;
	}

}
