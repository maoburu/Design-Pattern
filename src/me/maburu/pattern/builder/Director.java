package me.maburu.pattern.builder;

public class Director {
	
	public Person constructPerson(Builder builder) {
		
		builder.buildHead();
		
		builder.buildBody();
		
		builder.buildFoot();
		
		Person person = builder.buildPerson();
		
		return person;
	}
}
