package net.kushal.application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("boot-apps")
public class RestBootServiceController {
	private static String template = "Hello, %s";
@RequestMapping("/kush")
public String hello(@RequestParam(value="name",required=false,defaultValue="Stranger") String name){	
	return String.format(template, name);
}
}
