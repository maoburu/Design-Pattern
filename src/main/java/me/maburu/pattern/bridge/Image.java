package me.maburu.pattern.bridge;

/**
 * 
* @ClassName: Image 
* @Description: 抽象图像类：抽象类
* @author xiejian 
* @date 2018年1月29日 上午10:02:04 
*
 */
public abstract class Image {
	
	protected imageImpl imp;
	
	public void setImageImpl (imageImpl imp) {
		this.imp = imp;
	}
	
	public abstract void parseFile(String fileName);
}
