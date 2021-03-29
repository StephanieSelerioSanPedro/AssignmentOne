package web.api.sample.service;

import org.springframework.stereotype.Service;

@Service

public class GreetingService {
	
	public String viewGreeting(double d) {
		return "The answer is:" + " " +  d;
	}

}
