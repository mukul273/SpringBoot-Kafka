package com.springframework.kafka.SpringBootkafkaproducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private String name;
	private String dept;
	private Long sal;
	
}
