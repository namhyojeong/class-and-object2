package com.greedy.level03;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("번호 : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("부서 : ");
		String dept = sc.nextLine();
		System.out.print("직업 : ");
		String job = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		System.out.println("보너스포인트 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		System.out.println("핸드폰번호 : ");
		String phone = sc.nextLine();
		System.out.println("주소 : ");
		String address = sc.nextLine();
		
		EmployeeDTO em = new EmployeeDTO();
		
		em.setNumber(number);
		em.setName(name);
		em.setDept(dept);
		em.setJob(job);
		em.setAge(age);
		em.setGender(gender);
		em.setSalary(salary);
		em.setBonusPoint(bonusPoint);
		em.setPhone(phone);
		em.setAddress(address);
		
		System.out.println(em.getNumber());
		System.out.println(em.getName());
		System.out.println(em.getDept());
		System.out.println(em.getJob());
		System.out.println(em.getAge());
		System.out.println(em.getGender());
		System.out.println(em.getSalary());
		System.out.println(em.getBonusPoint());
		System.out.println(em.getPhone());
		System.out.println(em.getAddress());
	}
	
}
