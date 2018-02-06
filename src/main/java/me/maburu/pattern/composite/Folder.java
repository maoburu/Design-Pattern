package me.maburu.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
* @ClassName: Folder 
* @Description: 容器节点：文件夹
* @author xiejian 
* @date 2018年2月2日 上午9:55:35 
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
	 * 遍历文件夹下所有内容，并调用对应节点的杀毒方法
	 */
	public void killVirus() {
		System.out.println("对 folder:" + name + "进行杀毒");
		
		for (AbstractFile file : fileList) {
			file.killVirus();
		}
	}

}
