package com.pack.ipem;

import com.pack.ipem.bean.Student;

public class ManageStudent {

	public static void main(String[] args) {

		Student s=new Student();
		
//		s.stId=100;
		s.setStId(100);
		
//		System.out.println(s.stId);
		System.out.println(s.getStId());
		
	}

}
