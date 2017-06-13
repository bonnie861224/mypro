package oo.test;

public class PhoneMember extends Member {
	String phone;
	Boolean verified = false;

	public PhoneMember(String name) {
		super(name);
	}

	public PhoneMember() {

	}

	public String getPhone() {
		return phone;

	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isverified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

}
