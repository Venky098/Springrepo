package com.myApplication.Customer;

import java.io.FileInputStream;
import java.util.Properties;

public class JDBCdetails {
	
	
	
	private String username;
	private String password;
	private String driver;
	private String url;
	
	public JDBCdetails(){
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\git\\Springrepo\\Customer\\src\\main\\resources\\application.properties");
			Properties p = new Properties();
			p.load(fis);
			setUsername((String) p.get("USER"));
			setPassword((String) p.get("PASSWORD"));
			setDriver((String) p.get("JDBC_DRIVER"));
			setUrl((String) p.get("JDBC_URL"));
			}catch(Exception e) {
				System.out.println(" Some Exception : Check for the path of application.properties");
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	

}
