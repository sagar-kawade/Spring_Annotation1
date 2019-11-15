package com.Autowiredannotaion.sample;

import org.springframework.beans.factory.annotation.Autowired;

public class Services {
	Client cname;
	
	public Client getCname() {
		return cname;
	}
	@Autowired
	public void setCname(Client cname) {
		this.cname = cname;
	}
	
	@Autowired
	public Services(Client cname) {
		this.cname= cname;
		
	}
	public void setCname(String string) {
		
	}
	public void clientmethod() {
		cname.clientdata();
	}
	 
	

}
