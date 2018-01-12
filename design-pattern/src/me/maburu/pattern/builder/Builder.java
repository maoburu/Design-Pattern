package me.maburu.pattern.builder;

public interface Builder {
	
	void buildHead();
	
	void buildBody();
	
	void buildFoot();
	
	Person buildPerson();

}
