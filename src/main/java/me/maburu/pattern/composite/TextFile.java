package me.maburu.pattern.composite;

/**
 * 
* @ClassName: TextFile 
* @Description: 叶子节点：文本文件
* @author xiejian 
* @date 2018年2月2日 上午9:57:06 
*
 */
public class TextFile extends AbstractFile {
	private String name;
	
	public TextFile(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile component) {
		System.out.println("不支持该方法");
	}

	@Override
	public void delete(AbstractFile component) {
		System.out.println("不支持该方法");
	}

	@Override
	public AbstractFile getChild(int i) {
		System.out.println("不支持该方法");
		return null;
	}

	@Override
	public void killVirus() {
		System.out.println("对 textFile:" + name + "进行杀毒");
	}

}
