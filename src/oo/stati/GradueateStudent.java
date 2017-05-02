package oo.stati;

public class GradueateStudent extends Student {
	int thesis;

	public GradueateStudent(int english, int math, int chinese) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;

	}

	@Override //會去檢查是否有一樣的類別可以覆寫,防止寫錯
	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(math) + "\t" + getScore(chinese) + "\t" + thesis);
	}// 因為繼承不能繼承建構子只能繼承屬性方法還有protected所以要用override覆寫
}
