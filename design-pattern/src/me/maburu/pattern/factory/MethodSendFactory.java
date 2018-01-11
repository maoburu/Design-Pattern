package me.maburu.pattern.factory;

/**
 * 
* @ClassName: MethodSendFactory 
* @Description: 工厂方法模式  生成每个对象的创建方法，避免传参错误，但仍然存在扩展性的问题
* @author xiejian 
* @date 2018年1月11日 下午3:57:16 
*
 */
public class MethodSendFactory {
	
	public Send getSmsSender() {
		return new SmsSender();
	}
	
	public Send getEmailSender() {
		return new EMailSender();
	}
}
