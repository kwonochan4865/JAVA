package chapter13.framwork;

import java.util.LinkedList;
import java.util.Queue;


public class QueueExample13 {

	public static void main(String[] args) {
		Queue<Message12> messageQueue = new LinkedList<Message12>();
		
		messageQueue.offer(new Message12("sendMail", "홍길동"));
		messageQueue.offer(new Message12("snedSMS",  "신용권"));
		messageQueue.offer(new Message12("sendKakaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message12 message = messageQueue.poll();
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKaKaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}
	}

}
