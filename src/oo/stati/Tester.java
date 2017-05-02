package oo.stati;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Student.pass);// static不用生物件就已經存在一個值
		Student stu1 = new Student(50, 90, 80);
		Student stu2 = new Student(60, 58, 80);
		Student stu3 = new Student(71, 64, 83);
		stu1.pass = 70;// 因為static所以改一個全部都會跟著改
		stu1.print();
		stu2.print();
		stu3.print();
		GradueateStudent gstu1 = new GradueateStudent(67,85,89);
		GradueateStudent gstu2 = new GradueateStudent(88,84,65);
		gstu1.print();
		gstu2.print();
		//
		ArrayList<Student> list = new ArrayList();
		list.add(new Student(50, 90, 80));
		list.add(new Student(60, 58, 80));
		list.add(new Student(71, 64, 83));
		list.add(new GradueateStudent(67,85,89));
		list.add(new GradueateStudent(88,84,65));
		for(int i=0; i<list.size();i++){
			Student stu = list.get(i);
			stu.print();
			
		}
	}

}
