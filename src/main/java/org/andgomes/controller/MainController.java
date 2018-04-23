package org.andgomes.controller;

import org.andgomes.collection.Collection;
import org.andgomes.collection.CollectionWraper;
import org.andgomes.collection.Field;
import org.andgomes.collection.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value = "/", produces = "application/json")
	public CollectionWraper collection() {
		
		Collection collection = new Collection();
		collection.setHref("http://localhost:8585/spring-json-server/");
		
		Person person = new Person();
		person.setHref("http://localhost:8585/spring-json-server/person/kotaro");
		
		Field field1 = new Field();
		field1.setName("name");
		field1.setValue("Kotaro");
		
		Field field2 = new Field();
		field2.setName("age");
		field2.setValue("23");
		
		person.addField(field1);
		person.addField(field2);
		
		collection.addPerson(person);
		
		CollectionWraper wraper = new CollectionWraper(collection);
		
		return wraper;
		
	}
	
	@RequestMapping(value = "/person/kotaro", produces = "application/json")
	public CollectionWraper item() {
		
		Collection collection = new Collection();
		collection.setHref("http://localhost:8585/spring-json-server/");
		
		Person person = new Person();
		person.setHref("http://localhost:8585/spring-json-server/person/kotaro");
		
		Field field1 = new Field();
		field1.setName("name");
		field1.setValue("Kotaro");
		
		Field field2 = new Field();
		field2.setName("age");
		field2.setValue("23");
		
		person.addField(field1);
		person.addField(field2);
		
		collection.addPerson(person);
		
		CollectionWraper wraper = new CollectionWraper(collection);
		
		return wraper;
		
	}
	
}
