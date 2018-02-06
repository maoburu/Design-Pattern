package me.maburu.pattern.composite;

/**
 * 
* @ClassName: ImageFile 
* @Description: Ҷ�ڵ㣬ͼƬ�ļ�
* @author xiejian 
* @date 2018��2��2�� ����9:56:35 
*
 */
public class ImageFile extends AbstractFile {
	private String name;
	
	public ImageFile(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile component) {
		System.out.println("��֧�ָ÷���");
	}

	@Override
	public void delete(AbstractFile component) {
		System.out.println("��֧�ָ÷���");
	}

	@Override
	public AbstractFile getChild(int i) {
		System.out.println("��֧�ָ÷���");
		return null;
	}

	@Override
	public void killVirus() {
		System.out.println("�� imageFile:" + name + "����ɱ��");
	}

}
