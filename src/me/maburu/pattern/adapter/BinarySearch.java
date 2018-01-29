package me.maburu.pattern.adapter;

/**
 * 
* @ClassName: BinarySearch 
* @Description: 适配者类，二分查找
* @author xiejian 
* @date 2018年1月29日 上午9:39:40 
*
 */
public class BinarySearch {
	
	public int binarySearch(int array[], int key) {
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			int midVal = array[mid];
			if (midVal < key) {
				low = mid + 1;
			} else if (midVal > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
