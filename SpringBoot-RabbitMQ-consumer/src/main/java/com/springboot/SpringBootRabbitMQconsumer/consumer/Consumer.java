package com.springboot.SpringBootRabbitMQconsumer.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@RabbitListener(queues="${springboot.rabbitmq.queue}")
	public void receivedMessage(String msg) {
		System.out.println("Received:"+msg);
		
	}
	
		
		
	

}
