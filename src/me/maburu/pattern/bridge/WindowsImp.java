package me.maburu.pattern.bridge;

public class WindowsImp implements imageImpl {

	@Override
	public void doPaint(Matrix m) {
		//调用windows绘制函数绘制像素矩阵
		System.out.print("在windows系统中显示图像：");
	}

}
