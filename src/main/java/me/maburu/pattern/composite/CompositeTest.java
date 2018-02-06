package me.maburu.pattern.composite;

import org.junit.Test;

/**
 * 
* @ClassName: CompositeTest 
* @Description: ���ģʽ��͸�����ģʽ������ԭ����״�ṹ�е�Ҷ�ڵ��������ڵ����Ϊͬһ�����ࣨAbstractFile����
* 						�����������Ҷ�ӽڵ���������ڵ㣬ֻ��Ҫ�̳г����࣬ʵ�ֶ�Ӧ�������ɣ����ڿͻ�����˵��͸������������Ҫ���κε���
* 				ȱ�㣺����Ҷ�ӽڵ���Ҫʵ������������Ӧ�����෽����
* @author xiejian 
* @date 2018��2��2�� ����9:53:04 
*
 */
public class CompositeTest {
	@Test
	public void test1() {
		AbstractFile folder1 = new Folder("folder1");
		AbstractFile folder2 = new Folder("folder2");
		AbstractFile folder3 = new Folder("folder3");
		
		AbstractFile image1 = new ImageFile("image1");
		AbstractFile image2 = new ImageFile("image2");
		
		AbstractFile text1 = new TextFile("text1");
		AbstractFile text2 = new TextFile("text2");
		
		folder1.add(image1);
		folder2.add(image2);
		folder2.add(text2);
		folder3.add(text1);
		folder2.add(folder3);
		folder1.add(folder2);
		
		folder3.killVirus();
	}
}
