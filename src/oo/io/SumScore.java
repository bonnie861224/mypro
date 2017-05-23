package oo.io;

import java.io.FileOutputStream;
import java.util.Scanner;

public class SumScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FileOutputStream fos = new FileOutputStream("data.txt");
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("請輸入成績:");
			String data = scanner.nextLine();
			try {
				int score = Integer.parseInt(data);
				sum = sum + score;
			} catch (NumberFormatException e) {
				System.out.print("成績格式不符");
				i--;
			}
		}
		System.out.print(sum);
	}

}
