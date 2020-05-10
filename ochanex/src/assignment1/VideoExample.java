package assignment1;

import java.util.Scanner;
import java.util.Vector;

public class VideoExample {
	private Vector<EnrolledVideoinfo> vecEnroll = new Vector<EnrolledVideoinfo>();
	private Vector<Rental> vecRental = new Vector<Rental>();
	private Vector<Video> vecVdo = new Vector<Video>();
	private Vector<Member> vecMem = new Vector<Member>();

/////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////비디오 등록 과정 
	public void WaytoEnrollVdo() {
		if(this.vecEnroll.isEmpty()) {
			System.out.println("등록된 비디오가 없습니다.");
			return;
		}
		System.out.println("등록된 비디오 리스트를 출력합니다.");
//		this.printVideoList();

		int select = new Scanner(System.in).nextInt();
		boolean enrolledVdo = vecVdo.add(new Video(vecEnroll.get(select)));
		if (enrolledVdo)
			System.out.println("비디오 등록 완료");
		else
			System.out.println("비디오 등록에 실패하였습니다.");
	}
////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// 맴버 등록 과정
	public void WaytoEnrollMem() {
		boolean enrolledMem = vecMem.add(new Member());
		if (enrolledMem)
			System.out.println("맴버 등록 완료");
		else
			System.out.println("맴버 등록에 실패하였습니다.");
	}

////////////////////////////////////////////////////////////////////////////////////////////
	public void rentalVideo() {
		if (this.vecVdo.isEmpty() || this.vecMem.isEmpty()) {
			System.out.println("비디오나 고객이 등록돼 있지 않습니다. 등록 후 사용하실 수 있습니다.");
			return;
		}
		int vdoSelect;
		int memSelect;
		int rantalPeriod;

	}

	public void returnVideo() {

	}

	public void enrolledVdo() {

	}

	public void enrolledMem() {
		if (this.vecMem.isEmpty());
			
		{
			System.out.println("등록된 맴버가 없으니 추가 후 사용해주세요.");
			return;
		}
		for (int i = 0; i < vecMem.size(); i++) {
			System.out.print("" + i + ". ");
			System.out.print(vecMem.get(i).getId() + " ");
			System.out.print(vecMem.get(i).getName() + " ");
		}
	}

	public static void main(String[] args) {
		DateSet set = new DateSet();
		System.out.println(set.today);

	}
}
