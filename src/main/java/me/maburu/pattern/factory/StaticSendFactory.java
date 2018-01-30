package me.maburu.pattern.factory;

/**
 * 
* @ClassName: MethodSendFactory 
* @Description: 静态工厂方法模式  将对象生成方法改为静态方法，避免每次新建工厂类,节省内存空间
* @author xiejian 
* @date 2018年1月11日 下午3:57:16 
*
 */
public class StaticSendFactory {
	
	public static Send getSmsSender() {
		return new SmsSender();
	}
	
	public static Send getEmailSender() {
		return new EMailSender();
	}
}
