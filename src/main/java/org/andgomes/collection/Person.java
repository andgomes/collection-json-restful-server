package org.andgomes.collection;

import java.util.LinkedList;
import java.util.List;

public class Person  {

	private String href;
	private List<Field> data;
	
	public Person() {
		this.data = new LinkedList<>();
	}
	
	public String getHref() {
		return href;
	}
	
	public void setHref(String href) {
		this.href = href;
	}
	
	public List<Field> getData() {
		return data;
	}

	public void addField(Field field) {
		data.add(field);
	}
	
}
