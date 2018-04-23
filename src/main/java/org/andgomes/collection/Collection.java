package org.andgomes.collection;

import java.util.LinkedList;
import java.util.List;

public class Collection {

	private static final String version = "1.0";
	private String href;
	
	private List<Person> items;
	
	public Collection() {
		items = new LinkedList<>();
	}
	
	public void addPerson(Person person) {
		items.add(0, person);
	}
	
	public String getHref() {
		return this.href;
	}
	
	public void setHref(String href) {
		this.href = href;
	}
	
	public String getVersion() {
		return version;
	}
	
	public List<Person> getItems() {
		return this.items;
	}
	
}
