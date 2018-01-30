package me.maburu.pattern.factory;

/**
 * 
* @ClassName: Factory 
* @Description: 抽象工厂模式，将工厂抽象为一个接口，每个对象创建对应的工厂类，
* 				当遇到需要新增对象时，只需要新建对应的工厂类并集成工厂接口，增强了扩展性
* @author xiejian 
* @date 2018年1月11日 下午4:20:10 
*
 */
public interface Factory {
	
	public Send getSend();
}
