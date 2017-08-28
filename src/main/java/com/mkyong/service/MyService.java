package com.mkyong.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mkyong.WelcomeController;

@Service
public class MyService {
	private static final Logger logger = LoggerFactory
			.getLogger(WelcomeController.class);

	public List<Integer> getDetails() {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		logger.info("Response from getDetails() method is {}", list);
		return list;
	}
}
