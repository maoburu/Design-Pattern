package me.maburu.pattern.adapter;

/**
 * 
* @ClassName: OperationAdapter 
* @Description: ������������ͨ��������������Ķ��󲢵��������ߵ�ʵ�������������
* @author xiejian 
* @date 2018��1��29�� ����9:37:54 
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
