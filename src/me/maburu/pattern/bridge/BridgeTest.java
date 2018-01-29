package me.maburu.pattern.bridge;

import org.junit.Test;

/**
 * 
* @ClassName: BridgeTest 
* @Description: �Ž�ģʽ����������ͬά�ȵ����ֿ�������Ϊ���󻯺�ʵ�ֻ�������ɫ�����󻯽�ɫ��ά��ʵ�ֻ���ɫ��ʵ����ʵ��,
* 						�Ӷ�ʵ������ά�ȵĽ��
* 
* 						���������еĲ���ϵͳ��ͼ�����ͣ���������������������ϵͳ����ͼ��ģʽ��
* 						ֻ��Ҫ�ڶ�Ӧά�������ɶ�Ӧʵ���༴��
* @author xiejian 
* @date 2018��1��29�� ����10:19:06 
*
 */
public class BridgeTest {
	
	@Test
	public void test() {
		
		Image image = new JPEGImage();
		imageImpl imageImpl = new WindowsImp();
		image.setImageImpl(imageImpl);
		image.parseFile("demo.java");
	}
}
