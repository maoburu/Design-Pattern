package me.maburu.pattern.bridge;

public class UnixImp implements imageImpl {

	@Override
	public void doPaint(Matrix m) {
		//调用unix绘制函数绘制像素矩阵
		System.out.print("在unix系统中显示图像：");
	}

}
