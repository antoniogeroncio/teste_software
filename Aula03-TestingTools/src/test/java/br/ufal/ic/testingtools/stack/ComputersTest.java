package br.ufal.ic.testingtools.stack;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import br.ufal.ic.testingtools.category.DesktopTests;
import br.ufal.ic.testingtools.category.MainFrameTests;

public class ComputersTest {
	
	@Category(MainFrameTests.class)
	@Test(timeout = 50)
	public void testTimeRestrictionMainFrame() {
		Stack<Integer> myOtherStack = new Stack<Integer>(90);
		for (int i = 0; i < 90; i++) {
			myOtherStack.push(i);
		}
	}
	
	@Category(DesktopTests.class)
	@Test(timeout = 1000)
	public void testTimeRestrictionDesktop() {
		Stack<Integer> myOtherStack = new Stack<Integer>(10);
		for (int i = 0; i < 10; i++) {
			myOtherStack.push(i);
		}
	}
	
}
