package me.maburu.pattern.prototype;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
* @ClassName: PrototypeTest 
* @Description: 原型模式：
* 				通过一个已经存在的对象，复制出更多的具有与此对象具有相同类型的新的对象。
* 				原型模式在复制大对象时比直接new一个对象的性能要高很多，并且简化了对象的创建
* @author xiejian 
* @date 2018年1月12日 下午3:26:17 
*
 */
public class PrototypeTest {
	
	/**
	 * 
	* @Title: test1 
	* @Description: 原型模式-浅复制：
	* 				浅复制利用Object的clone方法，只可复制8种基本数据类型和其包装类（装拆箱？），对于引用类型对象，仍然指向同一对象
	* @param:     
	* @return void    
	* @throws
	 */
	@Test
	public void test1() {
		Book book1 = new Book();
		
		Author author = new Author();
		author.setName("谢健");
		author.setAge(25);
		
		book1.setPageNum(10);
		book1.setTitle("Java设计模式");
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
	* @Description: 原型模式-深复制：
	* 				深复制一般通过对象的序列化和反序列化来实现，
	* @param:     
	* @return void    
	* @throws
	 */
	@Test
	public void test2() {
		Book2 book1 = new Book2();
		
		Author author = new Author();
		author.setName("谢健");
		author.setAge(25);
		
		book1.setPageNum(10);
		book1.setTitle("Java设计模式");
		book1.setAuthor(author);
		
		Book2 book2 = book1.clone();
		
		Assert.assertNotSame(book1, book2);
		Assert.assertEquals(book1.getPageNum(), book2.getPageNum());
		Assert.assertNotSame(book1.getTitle(), book2.getTitle());
		Assert.assertNotSame(book1.getAuthor(), book2.getAuthor());
	
	}
}
