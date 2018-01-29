package me.maburu.pattern.bridge;

import org.junit.Test;

/**
 * 
* @ClassName: BridgeTest 
* @Description: 桥接模式：将两个不同维度的类拆分开来，分为抽象化和实现化两个角色。抽象化角色中维护实现化角色的实现类实例,
* 						从而实现两个维度的解耦。
* 
* 						例如例子中的操作系统与图像类型，解耦后如果出现新增操作系统或者图像模式，
* 						只需要在对应维度下生成对应实现类即可
* @author xiejian 
* @date 2018年1月29日 上午10:19:06 
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
