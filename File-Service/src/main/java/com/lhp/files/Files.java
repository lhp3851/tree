package com.lhp.files;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/file")
public class Files {

	@RequestMapping(value="/greeting")
	public String greeting(String greetings) {
		return greetings;
	}
	
	public static void main(String[] args) {
		

	}

}
