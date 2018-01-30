package me.maburu.pattern.bridge;

/**
 * 
* @ClassName: Image 
* @Description: ����ͼ���ࣺ������
* @author xiejian 
* @date 2018��1��29�� ����10:02:04 
*
 */
public abstract class Image {
	
	protected imageImpl imp;
	
	public void setImageImpl (imageImpl imp) {
		this.imp = imp;
	}
	
	public abstract void parseFile(String fileName);
}
