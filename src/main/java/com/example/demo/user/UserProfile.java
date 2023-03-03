package com.example.demo.user;

public class UserProfile {
	private int id;
	private String userId;
	private String password;
	private String name;
	private String phone;
	private String nickName;
	
	public UserProfile(int id, String userId, String password, String name, String phone, String nickName) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.nickName = nickName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
