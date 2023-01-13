package com.greedy.level01.basic;

public class Application {

	public static void main(String[] args) {

		MemberDTO member1 = new MemberDTO();
		
		
		System.out.println("id : " + member1.getId());
		System.out.println("pwd : " + member1.getPwd());
		System.out.println("name : " + member1.getName());
		System.out.println("age : " + member1.getAge());
		System.out.println("gender : " + member1.getGender());
		System.out.println("phone : " + member1.getPhone());
		System.out.println("email : " + member1.getEmail());
	
		MemberDTO member2 = new MemberDTO();
		member2.setId("user01");
		member2.setPwd("pass01");
		member2.setName("홍길동");
		member2.setAge(20);
		member2.setGender('M');
		member2.setPhone("010-1234-5678");
		member2.setEmail("hone123@greedy.com");
		
		System.out.println("변경 후 id : " + member2.getId());
		System.out.println("변경 후 pwd : " + member2.getPwd());
		System.out.println("변경 후 name : " + member2.getName());
		System.out.println("변경 후 age : " + member2.getAge());
		System.out.println("변경 후 gender : " + member2.getGender());
		System.out.println("변경 후 phone : " + member2.getPhone());
		System.out.println("변경 후 email : " + member2.getEmail());
		
	}

}
