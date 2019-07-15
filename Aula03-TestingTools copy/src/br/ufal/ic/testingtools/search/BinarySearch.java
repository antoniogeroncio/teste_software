package br.ufal.ic.testingtools.search;

import br.ufal.ic.testingtools.sort.QuickSort;
import br.ufal.ic.testingtools.sort.Sort;

public class BinarySearch {
	
	public int binarySearch(int v[], int element) {
		 int begin = 0;
		 int end = v.length - 1;
		 sortElements(v);
		 while (begin <= end) {			 
			 int middle = (begin + end) / 2;
			 if (v[middle] < element) {
				 begin = middle + 1;
			 } else if (v[middle] > element) {
				 end = middle - 1;
			 } else if (v[middle] == element) {
				 return middle;
			 }
		 }
		 return -1;
	}

	private void sortElements(int[] v) {
		Sort sort = null;
		if(v.length>0) {
			sort = new QuickSort();
			sort.sort(v);
		}
	}

}
