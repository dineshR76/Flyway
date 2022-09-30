package com.javatechie.spring.flyway.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "REGISTER_USERS")
public class User {
	@Id
	private int id;
	private String username;
	private String first_name;
	private String last_name;
}
