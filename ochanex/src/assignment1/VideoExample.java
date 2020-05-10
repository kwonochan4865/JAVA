package assignment1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class VideoExample {
	private Vector<SerialNumber> vecEnroll = new Vector<SerialNumber>();
	private Vector<Rental> vecRental = new Vector<Rental>();
	private Vector<Video> vecVdo = new Vector<Video>();
	private Vector<Member> vecMem = new Vector<Member>();

/////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////비디오 등록 과정 
	public void waytoEnrollVdo() {
		if (this.vecEnroll.isEmpty()) {
			System.out.println("등록된 바코드가 없습니다.");
			return;
		}
		System.out.println("등록된 비디오 리스트를 출력합니다.");
//		this.printVideoList();
		System.out.print("등록할 비디오의 바코드를 설정해주세요: ");
		int select = new Scanner(System.in).nextInt();
		boolean enrolledVdo = vecVdo.add(new Video(vecEnroll.get(select)));
		if (enrolledVdo)
			System.out.println("비디오 등록 완료");
		else
			System.out.println("비디오 등록에 실패하였습니다.");
	}

/////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////// 비디오 코드 등록 과정
	public void waytoEnrollVdoTitle() throws IOException {
		boolean isAdd = vecEnroll.add(new SerialNumber());
		if(isAdd)
			System.out.println("비디오 코드 등록 완료");
		else
			System.out.println("비디오 코드 등록 실패");
	}

////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////// 회원 등록 과정
	public void waytoEnrollMem() {
		boolean enrolledMem = vecMem.add(new Member());
		if (enrolledMem)
			System.out.println("회원 등록 완료");
		else
			System.out.println("회원 등록에 실패하였습니다.");
	}

////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////// 비디오 대여 
	public void rentalVideo() {
		if (this.vecVdo.isEmpty() || this.vecMem.isEmpty()) {
			System.out.println("비디오가  등록돼 있지 않습니다. 등록 후 사용하실 수 있습니다.");
			return;
		}
		int vdoSelect;
		int memSelect;
		int rantalPeriod;
	}

////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////// 비디오 반납
	public void returnVideo() {
		if (this.vecRental.isEmpty()) {
			System.out.println("반납할 비디오가 없습니다.");
			return;
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////// 비디오 등록 확인
	public void enrolledVdo() {
		SerialNumber eni = new SerialNumber();
		eni.setEnrolledVideoinfo();
	}

/////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////// 고객 등록 확인
	public void enrolledMem() {
		boolean isAdd = vecMem.add(new Member());
		if (isAdd)
			System.out.println("고객이 추가 되었습니다.");
		else
			System.out.println("고객 추가를 실패하였습니다.");
	}

	public void VideoInfo() {
		if(this.vecEnroll.isEmpty()) {
			System.out.println("비디오 코드 등록이 되어 있지 않습니다. 추가 바랍니다.");
			
		if(this.vecVdo.isEmpty()) {
			System.out.println("비디오 등록이 되어 있지 않습니다. 추가 바랍니다.");
			return;
			for(int i=0; i<)
		}
		}
	}
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////// main
	public static void main(String[] args) throws IOException {
		DateSet set = new DateSet();
		System.out.println(set.today);
		VideoExample ve = new VideoExample();
		Scanner sc = new Scanner(System.in);
		int sltMenu = 0;

		while (true) {
			System.out.println("");
			System.out.println("\t\t\t\t\t|\t\t(3) 비디오 코드 등록 \t\t |\t\t(6) 비디오 정보 ");
			System.out.println("(1) 비디오 반납\t\t|\t\t(4) 비디오 등록 \t\t\t | \t\t(7) 맴버 현황");
			System.out.println("(2) 비디오 대여\t\t|\t\t(5) 회원 등록\t\t\t | \t\t(8) 종료");
			System.out.println();
			System.out.print("\t\t\t\t\t\t*** 메뉴를 입력해주세요 *** ");
			try {
				sltMenu = sc.nextInt();
			} catch (InputMismatchException ime) {
				System.err.println("에러! 정수가 아닌 것을 입력했습니다.");
				break;
			}
			System.out.println("");
			switch (sltMenu) {
			case 1:
				ve.rentalVideo();
				break;
			case 2:
				ve.returnVideo();
				break;
			case 3:
				ve.waytoEnrollVdoTitle();
				break;
			case 4:
				ve.waytoEnrollMem();
				break;
			case 5:
				ve.waytoEnrollMem();
				break;
			case 8:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("메뉴 잘못 선택함. 다시 선택바람");
			}
		}
	}
}
