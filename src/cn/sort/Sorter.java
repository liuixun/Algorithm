package cn.sort;

import java.util.Comparator;

/**
 * @author liuxun
 * 策略模式：将算法封装到共同接口的独立的类中，使得它们之间可以相互转换
 */
public interface Sorter {
	
	/**
	 * 排序
	 * @param list 带排序的数组
	 */
	public <T extends Comparable<T>> void sort(T[] list);

	/**
	 * @author by liuxun
	 * @param list 待排序的数组
	 * @param comp 比较两个对象的比较器
	 * TODO
	 */
	public <T> void sort(T[] list, Comparator<T> comp);
}
