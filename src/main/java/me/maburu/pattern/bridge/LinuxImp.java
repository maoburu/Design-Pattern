package me.maburu.pattern.bridge;

public class LinuxImp implements imageImpl {

	@Override
	public void doPaint(Matrix m) {
		//����linux���ƺ����������ؾ���
		System.out.print("��linuxϵͳ����ʾͼ��");
	}

}
