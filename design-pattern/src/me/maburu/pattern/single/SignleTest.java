package me.maburu.pattern.single;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
* @ClassName: SignlePattern 
* @Description: ����ģʽ
* @author xiejian 
* @date 2018��1��10�� ����3:45:48 
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
* @Description: ����ʽ�������̲߳���ȫ��
* @author xiejian 
* @date 2018��1��10�� ����3:17:36 
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
* @author xiejian ����ʽ�������̲߳���ȫ��
* @date 2018��1��10�� ����3:23:20 
*
 */
class LazySingle2 {
	private static LazySingle2 instance;
	
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
* @Description: ����ʽ���� ˫�ؼ��(�̰߳�ȫ)
* 				Ŀ�ģ�ֻ��ֻ�ڵ�һ�ε���ʱ���������Ч��
* @author xiejian 
* @date 2018��1��10�� ����3:11:15 
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
* @Description: ����ʽ���� ��̬�ڲ��ࣨ�̰߳�ȫ  �Ƽ���
* 				ֻ���״ε���instance�ǻ�����ڲ���ĳ�ʼ���������ɵ������󣬽�����̰߳�ȫ���⣬ͬʱ�����˼���������Ч������
* @author xiejian 
* @date 2018��1��10�� ����3:26:34 
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
* @Description: ����ʽ���� ��
* 				���ഴ��ʱ���Ѵ�����̬���� ��
* 					���������̰߳�ȫ ���״ε��ü��ؿ�
* 					�ף�δ������ʱ���Ѵ����ö���ռ���ڴ���Դ
* @author xiejian 
* @date 2018��1��10�� ����3:31:11 
*
 */
class HungrySingle {
	private static final HungrySingle instance = new HungrySingle();
	
	private HungrySingle() {}
	
	public static HungrySingle getInstance() {
		return instance;
	}
}


