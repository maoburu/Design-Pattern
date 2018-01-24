package me.maburu.pattern.factory;

public class EMailSender implements Send {

	@Override
	public String send() {
		return "send e-mail";
	}

}
