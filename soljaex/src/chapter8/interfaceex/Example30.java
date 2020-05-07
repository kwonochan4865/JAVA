package chapter8.interfaceex;

public class Example30 {

	public static void main(String[] args) {
		ImplementationC29 impl = new ImplementationC29();
		
		InterfaceA26 ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB27 ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC28 ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		

	}

}
