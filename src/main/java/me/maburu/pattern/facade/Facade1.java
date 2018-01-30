package me.maburu.pattern.facade;

/**
 * 
* @ClassName: Facade1 
* @Description: 抽象门面类的实现类，内部包括了多个子系统的执行逻辑
* @author xiejian 
* @date 2018年1月30日 上午9:55:29 
*
 */
public class Facade1 implements AbstractFacade {
	
	private Reader reader = new Reader();
	
	private Encryptor encryptor = new Encryptor();
	
	private Writer writer = new Writer();

	@Override
	public void encrypt(String distFile, String targetFile) {
		String text = reader.read(distFile);
		String enText = encryptor.encrypt(text);
		writer.write(targetFile, enText);
	}

}
