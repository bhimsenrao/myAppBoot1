package com.spr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api")
public class MyController {
@GetMapping("/")
public String welcome() {
	return "welcome to All";
}
@GetMapping("/addValues/{p1}/{p2}")
public String add(@PathVariable("p1") Integer a,@PathVariable("p2") Integer b) {
	return "Sum="+(a+b);
}
@GetMapping("/load")
public ModelAndView load() {
	return new ModelAndView("file1");
}
@GetMapping("/query")
public String query(@RequestParam String user) {
	
	return "Hello.."+user;
}

}
