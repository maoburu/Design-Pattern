package me.maburu.pattern.bridge;

public class WindowsImp implements imageImpl {

	@Override
	public void doPaint(Matrix m) {
		//����windows���ƺ����������ؾ���
		System.out.print("��windowsϵͳ����ʾͼ��");
	}

}
