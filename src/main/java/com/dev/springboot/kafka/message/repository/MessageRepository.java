package com.dev.springboot.kafka.message.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageRepository {
	
	private List<String> list = new ArrayList<>();
	
	public void addMessage(String msg) {
		list.add(msg);
	}
	
	public String getAllMessages() {
		return list.toString();
	}
}
