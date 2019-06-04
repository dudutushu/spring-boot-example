package org.spring.boot.common;

import lombok.Data;

@Data
public class Result<T> {
	
	
	private String retCode;
	
	private String retMsg;
	
	private T result;

}
