package me.maburu.pattern.builder;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
* @ClassName: BuilderTest 
* @Description: ������ģʽ��
* 				��ͬ�ڹ�����ģʽ�ṩ���Ǵ����������ģʽ��������ģʽ�����ֲ�Ʒ�����������й��������������϶���
* @author xiejian 
* @date 2018��1��12�� ����2:36:46 
*
 */
public class BuilderTest {
	
	@Test
	public void test1() {
		Director director = new Director();
		
		Person person = director.constructPerson(new ManBuilder());
		
		Assert.assertEquals("man head", person.getHead());
		Assert.assertEquals("man body", person.getBody());
		Assert.assertEquals("man foot", person.getFoot());
	}
}
