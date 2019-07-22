package br.ufal.ic.testingtools.sort;

import java.util.Random;

public class SortTestBubbleSort extends SortTest {
	@Override
	public void inicializeSort() {
		sortTest = new BubbleSort();
	}
	
	@Override
	protected void inicializeArray(int elementsSize) {
		Random numericRandom = new Random();
		this.setElementsSize(elementsSize);
		elements = new int[elementsSize];
		for (int i = 0; i < elementsSize; ++i) {
			elements[i] = numericRandom.nextInt();
		}
	}
}
