package me.maburu.pattern.adapter;

import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {
	
	/**
	 * 
	* @Title: test1 
	* @Description: 对象适配器模式：适配器与适配者之间是关联关系，适配器通过实现目标接口或类的方法，包装适配者的实例对象并调用其方法，
	* 				从而完成适配者类与目标类的适配。
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
