package me.maburu.pattern.facade;

/**
 * 
* @ClassName: AbstractFacade 
* @Description: 抽象外观接口，客户端面向接口编程，实现与具体外观类的解耦，便于以后扩展
* @author xiejian 
* @date 2018年1月30日 上午9:51:42 
*
 */
public interface AbstractFacade {
	
	public void encrypt(String distFile, String targetFile);
}
