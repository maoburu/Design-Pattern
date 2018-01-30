package me.maburu.pattern.builder;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
* @ClassName: BuilderTest 
* @Description: 建造者模式。
* 				不同于工厂类模式提供的是创建单个类的模式，建造者模式将各种产品集中起来进行管理，用来创建复合对象
* @author xiejian 
* @date 2018年1月12日 下午2:36:46 
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
