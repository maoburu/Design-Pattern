package me.maburu.pattern.factory;

/**
 * 
* @ClassName: MethodSendFactory 
* @Description: ��������ģʽ  ����ÿ������Ĵ������������⴫�δ��󣬵���Ȼ������չ�Ե�����
* @author xiejian 
* @date 2018��1��11�� ����3:57:16 
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
