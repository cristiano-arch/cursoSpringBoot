package com.andcris.cursomc.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timestamps;
	
	public StandardError(Integer status, String msg, Long timestamps) {
		super();
		this.status = status;
		this.msg = msg;
		this.timestamps = timestamps;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimestamps() {
		return timestamps;
	}

	public void setTimestamps(Long timestamps) {
		this.timestamps = timestamps;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
