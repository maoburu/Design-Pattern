package me.maburu.pattern.adapter;

import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {
	
	/**
	 * 
	* @Title: test1 
	* @Description: ����������ģʽ����������������֮���ǹ�����ϵ��������ͨ��ʵ��Ŀ��ӿڻ���ķ�������װ�����ߵ�ʵ�����󲢵����䷽����
	* 				�Ӷ��������������Ŀ��������䡣
	* @param:     
	* @return void    
	* @throws
	 */
	@Test
	public void test1() {
		
		ScoreOperation operation = new OperationAdapter();
		int[] array = {1, 3, 5, 2, 4, 6, 9, 8, 7};
		int[] arr = operation.sort(array);
		int n = operation.search(arr, 5);
		Assert.assertEquals(n, 4);
	}
	
	@Test
	public void test2() {
		
	}
}
