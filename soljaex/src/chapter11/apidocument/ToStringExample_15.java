package chapter11.apidocument;

import java.util.Date;

public class ToStringExample_15 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date(); //예제에선 java.util에서 import 안 했는데 어케 가능한 건지 모르겄음 
		
		System.out.println(obj1.toString()); 
		System.out.println(obj2.toString());
		
	}
}
