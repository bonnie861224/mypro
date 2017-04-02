package oo.abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入你的發票號碼:");
		String s = scanner.nextLine();
		// ---------0123456789
		System.out.println(s.length());
		// String sub = n.substring(3,5);
		// String sub = n.substring(7);
		String sub = s.substring(s.length() - 3);
		System.out.println(sub);
		ArrayList<String> a = new ArrayList();
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		if(a.equals(sub)){
			
		}else{
			
		}
		
	}
}

