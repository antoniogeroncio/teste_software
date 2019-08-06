package br.ufal.ic.testingtools.stack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import br.ufal.ic.testingtools.category.GenericTests;

@Category(GenericTests.class)
public class GenericTest {
	@Test
	public void testPush() {
		Stack<Integer> stack = new Stack<Integer>(2);
		stack.push(1);
		stack.push(2);
		
		assertThat(2, is(stack.peek()));
	}
}

