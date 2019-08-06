package br.ufal.ic.testingtools.sort;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

public class SortTestQuickSort extends SortTest {
	@Override
	public void inicializeSort() {
		sortTest = new QuickSort();
	}
	
	@Test
	public void testSortEq() {
		this.setElementsSize(5);
		elements = new int[elementsSize];
		for (int i = 0; i < elementsSize; ++i) {
			elements[i] = 5;
		}
		sortTest.sort(elements);
		for (int i = 0; i < (elements.length -1); i++) {
			assertTrue(elements[i] <= elements[i+1]);
		}
	}
}
