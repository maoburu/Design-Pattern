package me.maburu.pattern.decorator;

/**
 * 
* @ClassName: ComponentDecorator 
* @Description: ����װ���࣬���󹹼�������࣬���ڸ����幹������ְ�𣬵��Ǿ���ְ������������ʵ�֡�
* 				��ά����һ�����󹹼���������ã�ͨ�������ÿ��Ե���װ��֮ǰ��������ķ�������ͨ����������չ�÷������Դﵽװ�ε�Ŀ��
* @author xiejian 
* @date 2018��1��29�� ����5:43:14 
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
