package me.maburu.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
* @ClassName: Folder 
* @Description: �����ڵ㣺�ļ���
* @author xiejian 
* @date 2018��2��2�� ����9:55:35 
*
 */
public class Folder extends AbstractFile {
	
	private List<AbstractFile> fileList = new ArrayList<>(); 
	private String name;
	
	public Folder(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile component) {
		fileList.add(component);
	}

	@Override
	public void delete(AbstractFile component) {
		fileList.remove(component);
	}

	@Override
	public AbstractFile getChild(int i) {
		return fileList.get(i);
	}
	
	@Override
	/**
	 * �����ļ������������ݣ������ö�Ӧ�ڵ��ɱ������
	 */
	public void killVirus() {
		System.out.println("�� folder:" + name + "����ɱ��");
		
		for (AbstractFile file : fileList) {
			file.killVirus();
		}
	}

}
