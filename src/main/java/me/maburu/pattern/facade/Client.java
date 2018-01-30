package me.maburu.pattern.facade;

import me.maburu.pattern.util.ConfigManager;

/**
 * 
* @ClassName: Client 
* @Description: 门面模式：为复杂的子系统应用提供一个统一的入口，对客户端屏蔽了子系统组件，简化客户端的访问复杂度。
* @author xiejian 
* @date 2018年1月30日 上午9:48:26 
*
 */
public class Client {
	
	public static void main(String[] args) {
		//此处通过配置文件的形式实现解耦，客户端只需面对接口编程，后续如需调整门面类，只需更改配置文件中的门面类配置即可
		AbstractFacade facade = (AbstractFacade) ConfigManager.getBean();
		facade.encrypt("C:/Users/Xiejian/Desktop/1.txt", "C:/Users/Xiejian/Desktop/2.txt");
	}

}
