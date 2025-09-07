package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class CommonUtils {

	public static void readPropertiesfile() {
		  
		FileInputStream fis;
		try {
			 fis = new FileInputStream("D:\\Selenium Kosmike Inst\\Project Folder\\OrangeHRM\\src\\test\\resource\\config.properties");
			 Properties config = new Properties();
			 config.load(fis);
		}catch(Exception c)
		{
			TestNgUtils.assertFail(c.getMessage());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
