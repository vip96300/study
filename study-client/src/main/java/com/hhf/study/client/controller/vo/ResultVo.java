package com.hhf.study.client.controller.vo;

public class ResultVo<T>{

	private Class<T> clazz;

	public ResultVo(int code, String depict, Object data){
		this.code=code;
		this.depict=depict;
		this.data=data;
	}

	/**
	 * 状态码
	 */
	private int code;
	/**
	 * 说明
	 */
	private String depict;
	/**
	 * 数据
	 */
	private Object data;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDepict() {
		return depict;
	}
	public void setDepict(String depict) {
		this.depict = depict;
	}
	public Object getData() {
		if(data==null){
			data=clazz;
		}
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
