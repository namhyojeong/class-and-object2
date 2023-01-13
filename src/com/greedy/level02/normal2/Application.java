package com.greedy.level02.normal2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		System.out.print("학년 : " );
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classroom = sc.nextInt();
		
		sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		StudentVO student = new StudentVO(grade, classroom, name, height, gender);
		
//		StudentVO student2 = new StudentVO("학년 : 1", "반 : 2", "이름 : 홍길동", "키 : 175.5", "성별 : 남");
//		System.out.println(student.getInformation());
		
		student.printInformation();
	}

}
