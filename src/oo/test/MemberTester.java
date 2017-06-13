package oo.test;

public class MemberTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member("Eric");
		m.setAge(-5);
		System.out.println(m.getAge());

		PhoneMember m2 = new PhoneMember();
		PhoneMember m3 = new PhoneMember("Hank");
	}
}
