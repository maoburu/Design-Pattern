package me.maburu.pattern.facade;

import me.maburu.pattern.util.ConfigManager;

/**
 * 
* @ClassName: Client 
* @Description: ����ģʽ��Ϊ���ӵ���ϵͳӦ���ṩһ��ͳһ����ڣ��Կͻ�����������ϵͳ������򻯿ͻ��˵ķ��ʸ��Ӷȡ�
* @author xiejian 
* @date 2018��1��30�� ����9:48:26 
*
 */
public class Client {
	
	public static void main(String[] args) {
		//�˴�ͨ�������ļ�����ʽʵ�ֽ���ͻ���ֻ����Խӿڱ�̣�����������������ֻ࣬����������ļ��е����������ü���
		AbstractFacade facade = (AbstractFacade) ConfigManager.getBean();
		facade.encrypt("C:/Users/Xiejian/Desktop/1.txt", "C:/Users/Xiejian/Desktop/2.txt");
	}

}
