package oo.test;

import java.util.Scanner;

public class MemberTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member("Eric");
		m.setAge(-5);
		System.out.println(m.getAge());

		PhoneMember m2 = new PhoneMember();
		PhoneMember m3 = new PhoneMember("Hank");

		System.out.println("請輸入電話號碼:");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int p = Integer.parseInt(s);
		System.out.println("請再輸入一次:");
		String s1 = scanner.nextLine();
		int p1 = Integer.parseInt(s1);
		if(p!=p1){
			System.out.println("驗證失敗");
		}else{
			System.out.println("驗證成功");
		}
	}
}
