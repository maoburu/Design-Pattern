package me.maburu.pattern.factory;

import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {
	
	/**
	 * 
	* @Title: test1 
	* @Description: �򵥹���ģʽ
	* @param:     
	* @return void    
	* @throws
	 */
	@Test
	public void test1() {
		SendFactory factory = new SendFactory();
		Send sender = factory.getInstance("email");
		String result = sender.send();
		Assert.assertEquals("send e-mail", result);
	}
	
	/**
	 * 
	* @Title: test2 
	* @Description: ��������ģʽ
	* @param:     
	* @return void    
	* @throws
	 */
	@Test
	public void test2() {
		MethodSendFactory factory = new MethodSendFactory();
		Send sender = factory.getSmsSender();
		String result = sender.send();
		Assert.assertEquals("send sms", result);
	}
	
	/**
	 * 
	* @Title: test3 
	* @Description: ��̬����ģʽ
	* @param:     
	* @return void    
	* @throws
	 */
	@Test
	public void test3() {
		Send sender = StaticSendFactory.getEmailSender();
		String result = sender.send();
		Assert.assertEquals("send e-mail", result);
	}
	
	/**
	 * 
	* @Title: test4 
	* @Description: ���󹤳�ģʽ
	* @param:     
	* @return void    
	* @throws
	 */
	@Test
	public void test4() {
		Factory factory = new SmsSenderFactory();
		Send sender = factory.getSend();
		String result = sender.send();
		Assert.assertEquals("send sms", result);
	}
}
