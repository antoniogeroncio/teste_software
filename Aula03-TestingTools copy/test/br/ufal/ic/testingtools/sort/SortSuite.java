package br.ufal.ic.testingtools.sort;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	SortTestQuickSort.class,
	SortTestSelectionSort.class,
	SortTestBubbleSort.class
})
public class SortSuite {}
