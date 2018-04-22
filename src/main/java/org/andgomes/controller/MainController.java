package org.andgomes.controller;

import org.andgomes.collection.Collection;
import org.andgomes.collection.CollectionWraper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value = "/", produces = "application/json")
	public CollectionWraper collection() {
		
		Collection collection = new Collection();
		collection.setHref("http://localhost:8585/spring-json-server/");
		
		CollectionWraper wraper = new CollectionWraper(collection);
		
		return wraper;
		
	}
	
}
