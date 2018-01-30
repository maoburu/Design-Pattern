package me.maburu.pattern.bridge;

public class LinuxImp implements imageImpl {

	@Override
	public void doPaint(Matrix m) {
		//调用linux绘制函数绘制像素矩阵
		System.out.print("在linux系统中显示图像：");
	}

}
