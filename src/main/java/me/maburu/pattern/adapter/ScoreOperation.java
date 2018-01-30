package me.maburu.pattern.adapter;

/**
 * 
* @ClassName: ScoreOperation 
* @Description: 目标接口：实现需要适配的方法
* @author xiejian 
* @date 2018年1月29日 上午9:39:12 
*
 */
public interface ScoreOperation {
	
	int[] sort(int array[]);//成绩排序
	
	int search(int array[], int key);//成绩查找
}
