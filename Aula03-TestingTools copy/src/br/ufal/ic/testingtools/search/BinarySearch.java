package br.ufal.ic.testingtools.search;

//For teaching purposes, this code is buggy
public class BinarySearch {
	
	public int binarySearch(int v[], int element) {
		 int begin = 0;
		 int end = v.length;
		 int middle;
		 while (begin < end) {
			 middle = (begin + end) / 2;
			 if (middle < element) {
				 begin = middle + 1;
			 } else if (middle > element) {
				 end = middle - 1;
			 } else {
				 return middle;
			 }
		 }
		 return -1;
	}

}
