package me.maburu.pattern.prototype;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
* @ClassName: PrototypeTest 
* @Description: ԭ��ģʽ��
* 				ͨ��һ���Ѿ����ڵĶ��󣬸��Ƴ�����ľ�����˶��������ͬ���͵��µĶ���
* 				ԭ��ģʽ�ڸ��ƴ����ʱ��ֱ��newһ�����������Ҫ�ߺܶ࣬���Ҽ��˶���Ĵ���
* @author xiejian 
* @date 2018��1��12�� ����3:26:17 
*
 */
public class PrototypeTest {
	
	/**
	 * 
	* @Title: test1 
	* @Description: ԭ��ģʽ-ǳ���ƣ�
	* 				ǳ��������Object��clone������ֻ�ɸ���8�ֻ����������ͺ����װ�ࣨװ���䣿���������������Ͷ�����Ȼָ��ͬһ����
	* @param:     
	* @return void    
	* @throws
	 */
	@Test
	public void test1() {
		Book book1 = new Book();
		
		Author author = new Author();
		author.setName("л��");
		author.setAge(25);
		
		book1.setPageNum(10);
		book1.setTitle("Java���ģʽ");
		book1.setAuthor(author);
		
		Book book2 = book1.clone();
		Assert.assertNotSame(book1, book2);
		
		Assert.assertEquals(book1.getPageNum(), book2.getPageNum());
		Assert.assertSame(book1.getTitle(), book2.getTitle());
		Assert.assertSame(book1.getAuthor(), book2.getAuthor());
	}
	
	/**
	 * 
	* @Title: test2 
	* @Description: ԭ��ģʽ-��ƣ�
	* 				���һ��ͨ����������л��ͷ����л���ʵ�֣�
	* @param:     
	* @return void    
	* @throws
	 */
	@Test
	public void test2() {
		Book2 book1 = new Book2();
		
		Author author = new Author();
		author.setName("л��");
		author.setAge(25);
		
		book1.setPageNum(10);
		book1.setTitle("Java���ģʽ");
		book1.setAuthor(author);
		
		Book2 book2 = book1.clone();
		
		Assert.assertNotSame(book1, book2);
		Assert.assertEquals(book1.getPageNum(), book2.getPageNum());
		Assert.assertNotSame(book1.getTitle(), book2.getTitle());
		Assert.assertNotSame(book1.getAuthor(), book2.getAuthor());
	
	}
}
