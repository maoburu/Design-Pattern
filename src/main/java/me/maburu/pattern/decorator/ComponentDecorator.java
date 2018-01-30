package me.maburu.pattern.decorator;

/**
 * 
* @ClassName: ComponentDecorator 
* @Description: 抽象装饰类，抽象构件类的子类，用于给具体构件增加职责，但是具体职责在其子类中实现。
* 				他维护了一个抽象构件对象的引用，通过该引用可以调用装饰之前构建对象的方法，并通过其子类扩展该方法，以达到装饰的目的
* @author xiejian 
* @date 2018年1月29日 下午5:43:14 
*
 */
public class ComponentDecorator extends Component {
	
	private Component component;
	
	public ComponentDecorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void display() {
		component.display();
	}

}
