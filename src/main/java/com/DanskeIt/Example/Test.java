package com.DanskeIt.Example;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

		eBook ebook = (eBook) context.getBean("ebook");
		System.out.println(ebook);
		context.close();
	}

}
