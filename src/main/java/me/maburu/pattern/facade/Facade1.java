package me.maburu.pattern.facade;

/**
 * 
* @ClassName: Facade1 
* @Description: �����������ʵ���࣬�ڲ������˶����ϵͳ��ִ���߼�
* @author xiejian 
* @date 2018��1��30�� ����9:55:29 
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
