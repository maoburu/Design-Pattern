package me.maburu.pattern.factory;

public class SmsSenderFactory implements Factory {

	@Override
	public Send getSend() {
		return new SmsSender();
	}

}
