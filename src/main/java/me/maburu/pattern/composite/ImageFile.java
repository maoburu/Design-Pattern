package me.maburu.pattern.composite;

/**
 * 
* @ClassName: ImageFile 
* @Description: 叶节点，图片文件
* @author xiejian 
* @date 2018年2月2日 上午9:56:35 
*
 */
public class ImageFile extends AbstractFile {
	private String name;
	
	public ImageFile(String name) {
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
		System.out.println("对 imageFile:" + name + "进行杀毒");
	}

}
