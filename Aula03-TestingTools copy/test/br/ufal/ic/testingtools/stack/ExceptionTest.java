package br.ufal.ic.testingtools.stack;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import br.ufal.ic.testingtools.category.ExceptionTests;

@Category(ExceptionTests.class)
public class ExceptionTest {

	@Test(expected = OverFlowStackException.class)
	public void testPushOverFlowStackException() {
		Stack<Integer> stack = new Stack<Integer>(0);
		stack.push(1);
	}
}
