package pcroom.user;

/*
  
클래스이름: User 사용자
 
버전정보:  v.1.0
 
날짜: 2020 - 03 - 25
 
작업자: 박민혜

 */

import java.util.HashMap;
import java.util.Map;

public abstract class User{
	
	
	private String id;
	private String pw;
	private int cardNum;
	private int money;
	private Map<String,String> user;
	private boolean log;  //기본 false
		

	
	abstract void logCheck();   //로그인상태 체크 
	
	
	
//	private void logCheck() {   //로그인상태 체크 
//		log = !log;
//	}

	
	
	public void login(String id, String pw) {
		this.id = id;
		this.pw = pw;
		
		
		
	}
	
	
	
	public void User() {
		user = new HashMap<String, String>();
		user.put("admin", "admin");
		
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	

}
