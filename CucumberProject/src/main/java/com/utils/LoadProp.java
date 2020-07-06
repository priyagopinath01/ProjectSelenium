package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class LoadProp {
	static Properties prop = new Properties();

	public LoadProp() throws Exception {
		try {
			File f = new File(
					System.getProperty("user.dir") + "\\src\\test\\resource\\com\\configuration\\Configuration.properties");
			FileInputStream fin = new FileInputStream(f);
			prop.load(fin);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public String getBrowserName() {
		String property = prop.getProperty("browserName");
		return property;
	}

	public String getUrl() {
		String property = prop.getProperty("Url");
		return property;
	}

	public String getWait() {
		String property = prop.getProperty("ImplicitWait");

		return property;

	}
	
	
	
	
}
