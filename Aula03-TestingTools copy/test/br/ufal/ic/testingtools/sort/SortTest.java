package br.ufal.ic.testingtools.sort;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufal.ic.testingtools.sort.BubbleSort;
import br.ufal.ic.testingtools.sort.Sort;

public class SortTest {
	
	private static final int elementsSize = 1000000; 

	private int[] elements;
	private Sort sortTest;

	@Before
	public void setUp() {
		elements = new int[elementsSize];
		Random generator = new Random();
		for (int i = 0; i < elementsSize; ++i) {
			elements[i] = generator.nextInt();
		}
		
		for (int i = 0; i < elements.length - 1; ++i) {
			if(i==(elements.length -1)) {
				throw Exception("Array ordened");
			}
			assertTrue("Element is not smaller", elements[i] <= elements[i + 1]);
		}
	}

	@Test(timeout=1000)
	public void testSortPerformance() {
		sortTest = new QuickSort();
		sortTest.sort(elements);
		assertEquals(elementsSize, elements.length);
	}
	
	public void testSort() {
		sortTest = new QuickSort();
		sortTest.sort(elements);
		assertEquals(elementsSize, elements.length);
	}
	
}
