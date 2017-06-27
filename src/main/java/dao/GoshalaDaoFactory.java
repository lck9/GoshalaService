package dao;

import org.springframework.beans.factory.annotation.Autowired;

public class GoshalaDaoFactory {
	
	@Autowired
	public static GoshalaDaoImpl impl; 
	
	public void setImpl(GoshalaDaoImpl impl) {
		this.impl = impl;
	}


	public static GoshalaDao getInstance(){
		return impl;
	}
}
