package com.zhiyou100.vo;

/**
 * ajax 返回数据的封装
 * @author yblh0
 *
 */
public class ResponseVo<T> {

	/**
	 * 失败的状态码
	 */
	private int errorCode;
	
	/**
	 * 失败的原因
	 */
	private String message;
	
	/**
	 * 正常返回的数据
	 */
	private T data;

	public ResponseVo() {
		super();
	}

	public ResponseVo(int errorCode, String message, T data) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseVo [errorCode=" + errorCode + ", message=" + message + ", data=" + data + "]";
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
