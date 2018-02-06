package me.maburu.pattern.composite;

/**
 * 
* @ClassName: TextFile 
* @Description: Ҷ�ӽڵ㣺�ı��ļ�
* @author xiejian 
* @date 2018��2��2�� ����9:57:06 
*
 */
public class TextFile extends AbstractFile {
	private String name;
	
	public TextFile(String name) {
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
		System.out.println("�� textFile:" + name + "����ɱ��");
	}

}
