package me.maburu.pattern.facade;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 
* @ClassName: Writer 
* @Description: 模拟子系统类
* @author xiejian 
* @date 2018年1月30日 上午9:54:54 
*
 */
public class Writer {
	
	public void write(String fileName, String text) {
		FileWriter writer = null;
		try {
			System.out.println("将字符串写入文件");
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
