package chapter8.interfaceex;

public class Example_30 {

	public static void main(String[] args) {
		ImplementationC_29 impl = new ImplementationC_29();
		
		InterfaceA_26 ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB_27 ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC_28 ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		

	}

}
