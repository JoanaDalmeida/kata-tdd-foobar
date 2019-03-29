package main.java.com.kata.enumerations;

public enum FooBarEnum {
	FOO("Foo"),
	BAR("Bar"),
	FOO_BAR("FooBar");
	
	private String label;
	
	FooBarEnum(String label) {
		this.label = label;
	}
	
	public String getLabel(){
		return this.label;
	}
}
