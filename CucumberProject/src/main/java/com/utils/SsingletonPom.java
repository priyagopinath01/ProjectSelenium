package com.utils;

import com.adactin.pom.HomePage;

public class SsingletonPom {
	private HomePage hp;

	public HomePage getHp() {
		if(hp==null) {
			hp=new HomePage();
		}
		return hp;
	}
	
	
	
	
	
}
