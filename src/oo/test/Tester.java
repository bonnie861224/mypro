package oo.test;

import oo.abstraction.Car;
import oo.stati.Student;

import java.util.ArrayList;

import java.util.Scanner;

public class Tester extends Object{
// extends object可以不用寫
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		System.out.println(stu);
		Car c = new Car("xx", "name", 2000);
		ArrayList<String> a = new ArrayList();
		// String[] numbers ={"331","821","886","554"};
		a.add("331");
		a.add("821");
		// a.add(123);
		a.add("886");
		// a.add(true);
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.set(2, "885");
		System.out.println(a);
		String data = a.get(2);//拿裡面的第三項
		// int n =(int)a.get(4);
		System.out.println(data);
//		Student stu = new Student();如果不是public就不能用
		}
	}



