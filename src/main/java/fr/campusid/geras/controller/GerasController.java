package fr.campusid.geras.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("geras")
public class GerasController {

	@RequestMapping("/test") 
	public String helloWorld() { 
		return "Hello World"; 
	} 

}
