package chapter2.varandtype;

public class ContinueKeyCodeReadExample_20 {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode); 
		}
	}
}
