package me.maburu.pattern.composite;

import org.junit.Test;

/**
 * 
* @ClassName: CompositeTest 
* @Description: 组合模式（透明组合模式）：将原有树状结构中的叶节点与容器节点抽象为同一抽象类（AbstractFile），
* 						如果出现新增叶子节点或者容器节点，只需要继承抽象类，实现对应方法即可，对于客户端来说是透明操作，不需要做任何调整
* 				缺点：新增叶子节点需要实现容器类所对应的冗余方法，
* @author xiejian 
* @date 2018年2月2日 上午9:53:04 
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
