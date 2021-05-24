package com.jjsoft;

public class StringUtil {
	
	public boolean isNull(String name) {
		if(null == name || "".equals(name)) {
			return true;
		}else {
			return false;
		}
	}

}
