package web.api.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import web.api.sample.service.GreetingService;

@RestController
@RequestMapping("/api")



public class GreetingRest {
	@Autowired
	GreetingService service; 
	
		@Value("${custom.config.key}")
		float key; 
	
	
	@GetMapping("/greet")
	public String greetByPassingParam(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
		return service.viewGreeting((a + b + c) * key);
	}
}
	
