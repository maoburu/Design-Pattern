package me.maburu.pattern.adapter;

/**
 * 
* @ClassName: OperationAdapter 
* @Description: 对象适配器，通过生成适配者类的对象并调用适配者的实例方法完成适配
* @author xiejian 
* @date 2018年1月29日 上午9:37:54 
*
 */
public class OperationAdapter implements ScoreOperation{
	private BinarySearch binarySearch;
	private QuickSort quickSort;
	
	public OperationAdapter() {
		this.binarySearch = new BinarySearch();
		this.quickSort = new QuickSort();
	}

	@Override
	public int[] sort(int[] array) {
		return quickSort.quickSort(array);
	}

	@Override
	public int search(int[] array, int key) {
		return binarySearch.binarySearch(array, key);
	}

}
