package me.maburu.pattern.bridge;

public class UnixImp implements imageImpl {

	@Override
	public void doPaint(Matrix m) {
		//����unix���ƺ����������ؾ���
		System.out.print("��unixϵͳ����ʾͼ��");
	}

}
