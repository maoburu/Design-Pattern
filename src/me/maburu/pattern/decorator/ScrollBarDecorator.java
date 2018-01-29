package me.maburu.pattern.decorator;

/**
 * 
* @ClassName: ScrollBarDecorator 
* @Description: ����װ���ࣺ����װ��������࣬�����򹹼�����µ�ְ�������Ե��ó��󹹼����ж���ķ����������������µķ�����������������Ϊ
* @author xiejian 
* @date 2018��1��29�� ����5:46:08 
*
 */
public class ScrollBarDecorator extends ComponentDecorator{

	public ScrollBarDecorator(Component component) {
		super(component);
	}
	
	public void display() {
		this.setScrollBar();
		super.display();
	}
	
	public void setScrollBar() {
		System.out.println("Ϊ�������ӹ�����");
	}

}
