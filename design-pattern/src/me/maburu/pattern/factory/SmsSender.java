package me.maburu.pattern.factory;

public class SmsSender implements Send {

	@Override
	public String send() {
		return "send sms";
	}

}
