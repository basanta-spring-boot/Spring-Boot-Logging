package com.mkyong;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mkyong.service.MyService;

@Controller
public class WelcomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(WelcomeController.class);
	@Autowired
	private MyService service;
	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/test")
	public String welcome(Map<String, Object> model) {
		logger.debug("Welcome {}", "testing");
		logger.info("testing message :{}", "Basanta Testing");
		List<Integer> data = service.getDetails();
		logger.info("resp in cntroller {}", data);
		model.put("message", this.message);
		return "welcome";
	}

}