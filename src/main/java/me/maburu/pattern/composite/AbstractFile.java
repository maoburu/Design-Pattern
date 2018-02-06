package me.maburu.pattern.composite;

/**
 * 
* @ClassName: AbstractFile 
* @Description: 叶节点和容器节点的抽象类
* @author xiejian 
* @date 2018年2月2日 上午9:55:13 
*
 */
public abstract class AbstractFile {
	
	public abstract void add(AbstractFile component);//增加成员
	
	public abstract void delete(AbstractFile component);//删除成员
	
	public abstract AbstractFile getChild(int i);//获得成员
	
	public abstract void killVirus(); //业务方法
}
