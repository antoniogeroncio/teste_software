package br.ufal.ic.testingtools.stack;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import br.ufal.ic.testingtools.category.ExceptionTests;

@RunWith(Categories.class)
@IncludeCategory({ExceptionTests.class})
@SuiteClasses({ExceptionTest.class, GenericTest.class})

public class CategorySuite { }
