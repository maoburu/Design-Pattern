package me.maburu.pattern.facade;

/**
 * 
* @ClassName: Encryptor 
* @Description: ģ����ϵͳ��
* @author xiejian 
* @date 2018��1��30�� ����9:55:11 
*
 */
public class Encryptor {
	
	public String encrypt(String text) {
		StringBuffer sb = new StringBuffer();
		System.out.println("���ݼ��ܣ�������ת����");
		
		char[] arr = text.toCharArray();
		for (char character : arr) {
			String enChar = String.valueOf(character % 7);
			sb.append(enChar);
		}
		System.out.println("���ܺ��ַ���Ϊ��" + sb.toString());
		return sb.toString();
	}
}
