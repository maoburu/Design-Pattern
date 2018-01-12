package me.maburu.pattern.builder;

public class ManBuilder implements Builder {

	private Person person;

	public ManBuilder() {
		// 创建一个person实例，用于调用set方法
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
