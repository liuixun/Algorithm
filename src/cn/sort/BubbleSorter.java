package cn.sort;

import java.util.Comparator;

public class BubbleSorter implements Sorter{
	
	@Override
	public <T extends Comparable<T>> void sort(T[] list){
		Boolean swapped = true;
		for (int i = 1, len= list.length; i < len && swapped; i++) {
			swapped = false;
			for (int j = 0; j < len-i; j++) {
				if (list[j].compareTo(list[j+1]) > 0) {
					T temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					swapped = true;
				}
			}
		}
	}
	
	@Override
	public <T> void sort(T[] list, Comparator<T> comp){
		Boolean swapped = true;
		for (int i = 1, len = list.length; i < len; i++) {
			swapped = false;
			for (int j = 0; j < len-i; j++) {
				T temp = list[j+1];
				list[j+1] = list[j];
				list[j] = temp;
				swapped = true;
			}
		}
	}
}
