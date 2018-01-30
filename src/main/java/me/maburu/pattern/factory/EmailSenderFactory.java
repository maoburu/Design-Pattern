package me.maburu.pattern.factory;

public class EmailSenderFactory implements Factory {

	@Override
	public Send getSend() {
		return new EMailSender();
	}
	
}
