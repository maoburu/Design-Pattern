package me.maburu.pattern.factory;

/**
 * 
* @ClassName: SendFactory 
* @Description: �򵥹�����ͨ�����ε���ʽ�������ɵĶ�����չ�Բ���
* @author xiejian 
* @date 2018��1��11�� ����3:55:22 
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
