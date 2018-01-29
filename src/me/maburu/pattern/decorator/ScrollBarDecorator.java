package me.maburu.pattern.decorator;

/**
 * 
* @ClassName: ScrollBarDecorator 
* @Description: 具体装饰类：抽象装饰类的子类，负责向构件添加新的职责。他可以调用抽象构件类中定义的方法，并可以增加新的方法用以扩充对象的行为
* @author xiejian 
* @date 2018年1月29日 下午5:46:08 
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
		System.out.println("为构建增加滚动条");
	}

}
