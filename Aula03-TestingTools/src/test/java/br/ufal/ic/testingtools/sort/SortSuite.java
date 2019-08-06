package br.ufal.ic.testingtools.sort;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({
	SortTestQuickSort.class,
	SortTestSelectionSort.class,
	SortTestBubbleSort.class
})
public class SortSuite {}
