package org.spring.boot.enums;

public enum ResultEnum {
	UNKNOWN_ERROR("-1", "未知错误"),
	SCUESS("0", "成功"),
	PRIMARY_SCHOO("1001","你还在上小学吧"),
	JUNIOR_SCHOO("1002","你终于上中学了");
	
	private String code;
	
	private String msg;

	private ResultEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
	

}
