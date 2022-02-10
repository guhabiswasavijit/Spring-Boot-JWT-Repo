package com.demo.bankapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Setter @Getter @EqualsAndHashCode
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;

	private User() {
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
}
