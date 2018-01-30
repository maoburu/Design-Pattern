package me.maburu.pattern.facade;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 
* @ClassName: Writer 
* @Description: ģ����ϵͳ��
* @author xiejian 
* @date 2018��1��30�� ����9:54:54 
*
 */
public class Writer {
	
	public void write(String fileName, String text) {
		FileWriter writer = null;
		try {
			System.out.println("���ַ���д���ļ�");
			writer = new FileWriter(fileName);
			writer.write(text);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
