package com.SpringBoot.RabbitMq.SpringBootRabbitMQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.RabbitMq.SpringBootRabbitMQ.producer.Producer;

@RestController
public class ProducerController {
	
	@Autowired
	Producer producer;
	
	@RequestMapping("/send/{msg}")
	public String sendMsg(@PathVariable String msg) {
		producer.prodeceMsg(msg);
		return "Done";
	}
	
	
	
		

}
