package com.vn.sound.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(name = "UserName", nullable = false)
	private String UserName;

	@Column(name = "PassWord", nullable = false)
	private String PassWord;

	@Column(name = "AuthenCode", nullable = false)
	private String AuthenCode;
}
