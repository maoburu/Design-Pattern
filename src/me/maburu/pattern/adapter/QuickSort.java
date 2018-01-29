package me.maburu.pattern.adapter;

/**
 * 
* @ClassName: QuickSort 
* @Description: 适配者类，快速排序
* @author xiejian 
* @date 2018年1月29日 上午9:40:08 
*
 */
public class QuickSort {
	
	public int[] quickSort(int[] array) {
		sort(array, 0, array.length - 1);
		return array;
	}

	private void sort(int[] array, int p, int r) {
		int q = 0;
		if (p < r) {
			q = partition(array, p, r);
			sort(array, p, q - 1);
			sort(array, q + 1, r);
		}
	}

	private int partition(int[] a, int p, int r) {
		int x = a[r];
		int j = p - 1;
		for (int i = p; i <= r - 1; i ++) {
			if (a[i] <= x) {
				j ++;
				swap(a, j, i);
			}
		}
		swap(a,j+1,r);
		return j + 1;
	}

	private void swap(int[] a, int j, int i) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,3,2,6,5,7,4,0};
		QuickSort quickSort = new QuickSort();
		int[] newArr = quickSort.quickSort(arr);
		for (int i : newArr) {
			System.out.println(i);
		}
	}
}
