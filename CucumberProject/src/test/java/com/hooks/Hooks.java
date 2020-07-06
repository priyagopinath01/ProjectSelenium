package com.hooks;

import com.opencart.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void beforeHook() {
		
		System.out.println("before hook");
	}
	
	@After
	public void afterHook() {
		System.out.println("after hook");
	}
}
