package me.maburu.pattern.factory;

/**
 * 
* @ClassName: SendFactory 
* @Description: 简单工厂，通过传参的形式决定生成的对象，扩展性不好
* @author xiejian 
* @date 2018年1月11日 下午3:55:22 
*
 */
public class SendFactory {
	
	public Send getInstance(String name) {
		if ("sms".equals(name)) {
			return new SmsSender();
		} else if ("email".equals(name)){
			return new EMailSender();
		}
		return null;
	}
}
