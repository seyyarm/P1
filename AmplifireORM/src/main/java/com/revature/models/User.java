package com.revature.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	
	@Column(name="username", unique=true, nullable=false)
	private String userName;
	
	@Column(name="password", nullable=false)
	private String pass;
	

	@Column(name="email", nullable=false)
	private String email;
	
	


	public User() {
		super();
	}


	public User(int id, String userName, String pass, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.pass = pass;
		this.email = email;
	}


	public User(String userName, String pass, String email) {
		super();
		this.userName = userName;
		this.pass = pass;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public int hashCode() {
		return Objects.hash(email, id, pass, userName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(pass, other.pass)
				&& Objects.equals(userName, other.userName);
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", pass=" + pass + ", email=" + email + "]";
	}
	
	

}
