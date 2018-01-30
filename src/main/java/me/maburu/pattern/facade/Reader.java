package me.maburu.pattern.facade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
* @ClassName: Reader 
* @Description: ģ����ϵͳ��
* @author xiejian 
* @date 2018��1��30�� ����9:54:29 
*
 */
public class Reader {
	
	public String read(String fileName) {
		StringBuffer sb = new StringBuffer();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String len = null;
			while((len = reader.readLine()) != null) {
				sb.append(len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("��ȡ�ļ�����Ϊ��" + sb.toString());
		return sb.toString();
		
	}
}
