package br.ufal.ic.testingtools;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.ufal.ic.testingtools.sort.SortSuite;
import br.ufal.ic.testingtools.stack.StackSuite;

@RunWith(Categories.class)
@Suite.SuiteClasses({
	SortSuite.class,
	StackSuite.class,
	BinarySearchTest.class
})
public class AllTestsSuite {}
