package me.maburu.pattern.builder;

public class ManBuilder implements Builder {

	private Person person;

	public ManBuilder() {
		// ����һ��personʵ�������ڵ���set����
		person = new Person();
	}

	@Override
	public void buildHead() {
		person.setHead("man head");
	}

	@Override
	public void buildBody() {
		person.setBody("man body");
	}

	@Override
	public void buildFoot() {
		person.setFoot("man foot");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
