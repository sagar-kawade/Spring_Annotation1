package com.Qulifierannotation.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Library {
	@Autowired
	@Qualifier("book")
	
	Books book1;
	

	public Library() {
		System.out.println("in library constructor");
	}
	
	public void show_id() {
		System.out.println("books id's ="+book1.getBook_id());
	}
	public void show_name() {
		System.out.println("books id's ="+book1.getBook_name());
	}
	
	

}
