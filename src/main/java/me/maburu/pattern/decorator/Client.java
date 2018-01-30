package me.maburu.pattern.decorator;

public class Client {
	
	public static void main(String[] args) {
		Component component,componentSB,componentBB;
		
		component = new Window();
		
		componentSB = new ScrollBarDecorator(component);
		componentSB.display();
		System.out.println("");
		
		componentBB = new BlackBorderDecorator(componentSB);
		componentBB.display();
	}
}
