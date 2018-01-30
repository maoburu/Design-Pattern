package me.maburu.pattern.facade;

/**
 * 
* @ClassName: Encryptor 
* @Description: 模拟子系统类
* @author xiejian 
* @date 2018年1月30日 上午9:55:11 
*
 */
public class Encryptor {
	
	public String encrypt(String text) {
		StringBuffer sb = new StringBuffer();
		System.out.println("数据加密，将明文转密文");
		
		char[] arr = text.toCharArray();
		for (char character : arr) {
			String enChar = String.valueOf(character % 7);
			sb.append(enChar);
		}
		System.out.println("加密后字符串为：" + sb.toString());
		return sb.toString();
	}
}
