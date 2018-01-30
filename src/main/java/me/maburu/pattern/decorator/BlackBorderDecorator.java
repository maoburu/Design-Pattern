package me.maburu.pattern.decorator;

/**
 * 
* @ClassName: BlackBorderDecorator 
* @Description: ����װ���ࣺ����װ��������࣬�����򹹼�����µ�ְ�������Ե��ó��󹹼����ж���ķ����������������µķ�����������������Ϊ
* @author xiejian 
* @date 2018��1��29�� ����5:47:54 
*
 */
public class BlackBorderDecorator extends ComponentDecorator {

	public BlackBorderDecorator(Component component) {
		super(component);
	}

	public void display() {
		this.setBlackBorder();
		super.display();
	}
	
	public void setBlackBorder() {
		System.out.println("Ϊ�������Ӻ�ɫ�߿�");
	}
}
