package kr.ac.syu.vo;

public class MessageVO {
	String message;

	public String getData() {
		return message;
	}

	public void setData(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageVO [message=" + message + "]";
	}
}
