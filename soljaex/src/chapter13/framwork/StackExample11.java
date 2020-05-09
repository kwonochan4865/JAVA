package chapter13.framwork;

import java.util.Stack;

public class StackExample11 {

	public static void main(String[] args) {
		Stack<Coin10> coinBox = new Stack<Coin10>();

		coinBox.push(new Coin10(100));
		coinBox.push(new Coin10(500));
		coinBox.push(new Coin10(50));
		coinBox.push(new Coin10(10));

		while (!coinBox.isEmpty()) {
			Coin10 coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
