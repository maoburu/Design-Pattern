package me.maburu.pattern.decorator;

/**
 * 
* @ClassName: BlackBorderDecorator 
* @Description: 具体装饰类：抽象装饰类的子类，负责向构件添加新的职责。他可以调用抽象构件类中定义的方法，并可以增加新的方法用以扩充对象的行为
* @author xiejian 
* @date 2018年1月29日 下午5:47:54 
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
		System.out.println("为构建增加黑色边框");
	}
}
