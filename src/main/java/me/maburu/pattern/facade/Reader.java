package me.maburu.pattern.facade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
* @ClassName: Reader 
* @Description: 模拟子系统类
* @author xiejian 
* @date 2018年1月30日 上午9:54:29 
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
		System.out.println("读取文件内容为：" + sb.toString());
		return sb.toString();
		
	}
}
