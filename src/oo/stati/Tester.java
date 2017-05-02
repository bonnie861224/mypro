package oo.stati;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Student.pass);// static不用生物件就已經存在一個值
		Student stu = new Student();
		Student stu1 = new Student(50, 90, 80);
		Student stu2 = new Student(60, 58, 80);
		stu1.pass = 70;// 因為static所以改一個全部都會跟著改
		stu1.print();
		stu2.print();
		GradueateStudent gstu = new GradueateStudent(68,85,89);
		gstu.print();
	}

}
