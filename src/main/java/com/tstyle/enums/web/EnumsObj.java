package com.tstyle.enums.web;

import java.io.Serializable;

/**
 * @Description:枚举转换而来的bean
 * @author: zhouyucheng
 * @date: 2016年2月29日 下午12:29:53
 * @version 51offer免费留学服务平台
 */
public class EnumsObj implements Serializable {

	/**   
	 * @Fields serialVersionUID : TODO 
	 */  
	private static final long serialVersionUID = -2574955373421778728L;
	private int id;
	private String code;
	private String value;
	private int type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "EnumsObj [id=" + id + ", code=" + code + ", value=" + value + ", type=" + type + "]";
	}

}
