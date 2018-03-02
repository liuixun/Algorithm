package cn.search;

import java.util.Comparator;

public class BinarySearch {

	public static <T extends Comparable<T>> int search(T[] array, T key){
		return search(array, 0, array.length - 1, key);
	}
	
	//循环实现二分查找
	//low + (high – low) / 2或low + (high – low) >> 1或
	//(low + high) >>> 1（>>>是逻辑右移，是不带符号位的右移）
	public static <T> int search(T[] array, T key, Comparator<T> comp){
		int low = 0;
		int high = array.length - 1;
		while(low <= high){
			int mid = (low + high) >>> 1;
			int cmp = comp.compare(array[mid], array[high]);
			if (cmp < 0) {
				low = mid + 1;
			}else if(cmp > 0){
				high = mid - 1;
			}else{
				return mid;
			}
		}
		return -1;
	} 
	public static <T extends Comparable<T>> int search(T[] array, int low, int high, T key){
		if (low <= high) {
			int mid = low + ((low + high) >> 1);
			if (key == array[mid]) {
				return mid;
			}else if(key.compareTo(array[mid]) > 0){
				return search(array, mid + 1, high, key);
			}else{
				return search(array, low, mid - 1, key);
			}
		}
		return -1;
	}
	
}
