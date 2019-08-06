package br.ufal.ic.testingtools;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import br.ufal.ic.testingtools.search.BinarySearch;

public class BinarySearchTest {
	
	private static final int INDEX_NOT_FOUND = -1;
	private static final int INDEX_0 = 0;
	private static final int INDEX_2 = 2;
	private static final int INDEX_4 = 4;
	
	protected int[] values;
	protected BinarySearch search;
	
	@Before
	public void setUp() {
		values = new int[] {3,2,5,1,4};
		search = new BinarySearch();
	}
	
	@Test(expected = NullPointerException.class)
	public void searchArrayNull() {
		search.binarySearch(null, 3);
	}
	
	@Test
	public void searchArrayEmpty() {
		int searchReturn = search.binarySearch(new int[]{}, 1);
		assertThat(searchReturn, is(INDEX_NOT_FOUND));
	}
	
	@Test
	public void searchFirstElement() {
		int searchReturn = search.binarySearch(values, 1);
		assertThat(searchReturn, is(INDEX_0));
	}
	
	@Test
	public void searchLastItem() {
		int searchReturn = search.binarySearch(values, 5);
		assertThat(searchReturn, is(INDEX_4));
	}
	
	@Test
	public void searchMiddleElement() {
		int searchReturn = search.binarySearch(values, 3);
		assertThat(searchReturn, is(INDEX_2));
	}
	
	

}
