package me.maburu.pattern.decorator;

/**
 * 
* @ClassName: Component 
* @Description: 具体构件和抽象装饰类的共同父类，声明了具体构件中实现的方法，
* 				他的引入可以使客户端以一致的方式处理未被装饰的对象和装饰后的对象，实现客户端的透明操作
* @author xiejian 
* @date 2018年1月29日 下午5:40:58 
*
 */
public abstract class Component {
	
	public abstract void display();
	
}
