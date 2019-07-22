package br.ufal.ic.testingtools.sort;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public abstract class SortTest {

	private static final int ELEMENTS_SIZE_TEST_5 = 5;

	private static final int ELEMENTS_SIZE_PERFORMANCE_1000000 = 1000000;

	private static final int TIMEOUT_PERFORMANCE_1000 = 1000;

	protected int[] elements;
	protected Sort sortTest;
	protected int elementsSize;

	@Before
	public abstract void inicializeSort();
	
	@Test(timeout = TIMEOUT_PERFORMANCE_1000)
	public void testPerformance() {
		this.inicializeArray(ELEMENTS_SIZE_PERFORMANCE_1000000);
		sortTest.sort(elements);
		assertThat(elementsSize, is(elements.length));
	}
	
	@Test
	public void testSort() {
		this.inicializeArray(ELEMENTS_SIZE_TEST_5);
		sortTest.sort(elements);
		for (int i = 0; i < (elements.length -1); i++) {
			assertTrue(elements[i] < elements[i+1]);
		}
	}
	
	protected void inicializeArray(int elementsSize){
		this.setElementsSize(elementsSize);
		elements = new int[elementsSize];
		for (int i = 0; i < elementsSize; ++i) {
			elements[i] = elementsSize - i;
		}
	}
	
	protected void setElementsSize(int elementsSize) {
		this.elementsSize = elementsSize;
	}
	
}