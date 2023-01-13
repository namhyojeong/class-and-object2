package com.greedy.level02.normal;

public class Application {

	public static void main(String[] args) {

		BookDTO book = new BookDTO();
		System.out.println(book.getInformation());
//		System.out.println(book);
		BookDTO book2 = new BookDTO("자바의 정석", "도우출판", "남궁성", 0, 0.0);
		System.out.println(book2.getInformation());
		
		BookDTO book3 = new BookDTO("홍길동전", "활빈당" , "허균" , 5000000, 0.5);
		System.out.println(book3.getInformation());
	}

}
