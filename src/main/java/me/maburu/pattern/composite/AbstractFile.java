package me.maburu.pattern.composite;

/**
 * 
* @ClassName: AbstractFile 
* @Description: Ҷ�ڵ�������ڵ�ĳ�����
* @author xiejian 
* @date 2018��2��2�� ����9:55:13 
*
 */
public abstract class AbstractFile {
	
	public abstract void add(AbstractFile component);//���ӳ�Ա
	
	public abstract void delete(AbstractFile component);//ɾ����Ա
	
	public abstract AbstractFile getChild(int i);//��ó�Ա
	
	public abstract void killVirus(); //ҵ�񷽷�
}
