package me.maburu.pattern.single;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
* @ClassName: SignlePattern 
* @Description: 单例模式
* @author xiejian 
* @date 2018年1月10日 下午3:45:48 
*
 */
public class SignleTest {
		
	@Test
	public void test1() {
		
		LazySingle1 instance1 = LazySingle1.getInstance();
		LazySingle1 instance2 = LazySingle1.getInstance();
		
		Assert.assertSame(instance1, instance2);
	}
	
	@Test
	public void test2() {
		LazySingle2 instance1 = LazySingle2.getInstance();
		LazySingle2 instance2 = LazySingle2.getInstance();
		
		Assert.assertSame(instance1, instance2);
	}
	
	@Test
	public void test3() {
		LazySingle3 instance1 = LazySingle3.getInstance();
		LazySingle3 instance2 = LazySingle3.getInstance();
		
		Assert.assertSame(instance1, instance2);
	}
	
	@Test
	public void test4() {
		LazySingle4 instance1 = LazySingle4.getInstance();
		LazySingle4 instance2 = LazySingle4.getInstance();
		
		Assert.assertSame(instance1, instance2);
	}
	
	@Test
	public void test5() {
		HungrySingle instance1 = HungrySingle.getInstance();
		HungrySingle instance2 = HungrySingle.getInstance();
		
		Assert.assertSame(instance1, instance2);
	}
	
}

/**
 * 
* @ClassName: LaztSingle 
* @Description: 懒汉式单例（线程不安全）
* @author xiejian 
* @date 2018年1月10日 下午3:17:36 
*
 */
class LazySingle1 {
	private static LazySingle1 instance;
	
	private LazySingle1() {}
	
	public static LazySingle1 getInstance() {
		
		if (instance == null) {
			instance = new LazySingle1();
		}
		return instance;
	}
}


/**
 * 
* @ClassName: LazySingle2 
* @Description: TODO
* @author xiejian 懒汉式单例（线程不安全）
* @date 2018年1月10日 下午3:23:20 
*
 */
class LazySingle2 {
	private volatile static LazySingle2 instance;
	
	private LazySingle2() {}
	
	public static synchronized LazySingle2 getInstance() {
		if (instance == null) {
			instance = new LazySingle2();
		}
		return instance;
	}
}


/**
 * 
* @ClassName: LazySingle 
* @Description: 懒汉式单例 双重检查(线程安全)
* 				目的：只在只在第一次调用时加锁，提高效率
* @author xiejian 
* @date 2018年1月10日 下午3:11:15 
*
 */
class LazySingle3{
	
	private static LazySingle3 instance;
	
	private LazySingle3() {}
	
	public static LazySingle3 getInstance() {
		if (instance == null) {
			synchronized (LazySingle3.class){
				if (instance == null) {
					instance = new LazySingle3();
				}
			}
		}
		return instance;
	}
}

/**
 * 
* @ClassName: LazySingle4 
* @Description: 懒汉式单例 静态内部类（线程安全  推荐）
* 				只在首次调用instance是会进行内部类的初始化，并生成单例对象，解决了线程安全问题，同时避免了加锁带来的效率问题
* @author xiejian 
* @date 2018年1月10日 下午3:26:34 
*
 */
class LazySingle4 {
	private static class LazyHolder {
		private static final LazySingle4 instance = new LazySingle4();
	}
	
	private LazySingle4() {}
	
	public static LazySingle4 getInstance() {
		return LazyHolder.instance;
	}
}

/**
 * 
* @ClassName: HungrySingle 
* @Description: 饿汉式单例 ：
* 				在类创建时就已创建静态对象 ，
* 					利：天生线程安全 ，首次调用加载快
* 					弊：未被调用时就已创建好对象，占用内存资源
* @author xiejian 
* @date 2018年1月10日 下午3:31:11 
*
 */
class HungrySingle {
	private static final HungrySingle instance = new HungrySingle();
	
	private HungrySingle() {}
	
	public static HungrySingle getInstance() {
		return instance;
	}
	
}


