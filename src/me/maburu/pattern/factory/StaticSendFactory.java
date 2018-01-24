package me.maburu.pattern.factory;

/**
 * 
* @ClassName: MethodSendFactory 
* @Description: ��̬��������ģʽ  ���������ɷ�����Ϊ��̬����������ÿ���½�������,��ʡ�ڴ�ռ�
* @author xiejian 
* @date 2018��1��11�� ����3:57:16 
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
