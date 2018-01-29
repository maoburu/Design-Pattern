package me.maburu.pattern.decorator;

/**
 * 
* @ClassName: TextBox 
* @Description: 具体构件类，抽象构件类的子类，用于定义具体的构件对象，实现在抽象构件中的方法。
* @author xiejian 
* @date 2018年1月29日 下午5:49:24 
*
 */
public class TextBox extends Component {

	@Override
	public void display() {
		System.out.println("显示文本框");
	}
	
}
