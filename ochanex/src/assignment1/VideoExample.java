package assignment1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class VideoExample {
	private Vector<VideoinfoWrite> vecEnroll = new Vector<VideoinfoWrite>();
	private Vector<Rental> vecRental = new Vector<Rental>();
//	private Vector<VideoCode> vecCode = new Vector<VideoCode>();
	private Vector<Member> vecMem = new Vector<Member>();
//	VideoinfoRead vi = new VideoinfoRead();
	
	public Vector<VideoinfoWrite> getvecEnroll() {
		return vecEnroll;
	}

	public void setvecEnroll(Vector<VideoinfoWrite> vecEnroll) {
		this.vecEnroll = vecEnroll; // 비디오 정보를 밖으로 호출하기 위해 필요
	}

//-----------------------------------------------------------------------------------------------------------------
/////////////////////////////////(1) 비디오 대여 
	public void rentalVideo() throws IOException {
		if (this.vecEnroll.isEmpty() || this.vecMem.isEmpty()) {
			System.out.println("비디오가  등록돼 있지 않습니다. 등록 후 사용하실 수 있습니다.");
			return;
		}
		int vdoSelect;
		int memSelect;
		int rantalPeriod;
		System.out.println("비디오 대여");
		memInfo();
		System.out.print("대여할 고객을 선택해 주세요 : ");
		memSelect = new Scanner(System.in).nextInt();

		vdoInfo();

		System.out.print("대여할 비디오를 선택해주세요");
	}

////////////////////////////////////(2) 비디오 반납
	public void returnVideo() {
		if (this.vecRental.isEmpty()) {
			System.out.println("반납할 비디오가 없습니다.");
			return;
		}
		int vdoSelect;
//		this.enrolledRentalList();
	}

//-----------------------------------------------------------------------------------------------------------------
//////////////////////////////////// (3)비디오 코드 등록 과정
	public void waytoEnrollVdoCode() throws IOException {
		boolean isAdd = vecEnroll.add(new VideoinfoWrite());
		if (isAdd)
			System.out.println("비디오 코드 등록 완료");
		else
			System.out.println("비디오 코드 등록 실패");
	}
////////////////////////////////////비디오 등록 과정 
//	public void waytoEnrollVdo() {
//		if (this.vecEnroll.isEmpty()) {
//			System.out.println("등록된 바코드가 없습니다.");
//			return;
//		}
//		System.out.println("등록된 비디오 리스트를 출력합니다.");
////		this.printVideoList();
//		System.out.print("등록할 비디오의 바코드를 설정해주세요: ");
//		int select = new Scanner(System.in).nextInt();
//		boolean enrolledVdo = vecCode.add(new VideoCode(vecCode.getBarcodenum().get(select)));
//		if (enrolledVdo)
//			System.out.println("비디오 등록 완료");
//		else
//			System.out.println("비디오 등록에 실패하였습니다.");
//	}

/////////////////////////////(4) 회원 등록 과정
	public void waytoEnrollMem() {

	}

//-----------------------------------------------------------------------------------------------------------------
//////////////////////////////////////(5) 비디오 정보 
	public void vdoInfo() throws IOException {

		VideoinfoRead vi = new VideoinfoRead();
		if (this.vecEnroll.isEmpty()) {
			System.out.println("비디오 등록이 되어 있지 않습니다. 추가 바랍니다.");
			return;
		}
		for (int i = 0; i < vecEnroll.size(); i++) {
			System.out.println("번호\t\t제목\t\t감독\t\t바코드");
			System.out.print("" + i + ". ");
			System.out.print("\t\t\t" +vecEnroll.get(i).getTitle() + "\t\t\t");
			System.out.print(vecEnroll.get(i).getDirector() + "\t\t\t");
			System.out.print(vecEnroll.get(i).getBarcodenum() + "\t\t\t");
			System.out.print(vecEnroll.get(i).getOpenyear() + "\t\t\t");

		}
	}

//////////////////////////////////////////(6) 회원 정보 
	public void memInfo() {
		boolean enrolledMem = vecMem.add(new Member());
		if (enrolledMem)
			System.out.println("회원 등록 완료");
		else
			System.out.println("회원 등록에 실패하였습니다.");
	}

//-----------------------------------------------------------------------------------------------------------------
/////////////////////////////////////////////////// main
	public static void main(String[] args) throws IOException {
		DateSet set = new DateSet();
		System.out.println(set.today);
		VideoExample ve = new VideoExample();
		Scanner sc = new Scanner(System.in);
		int sltMenu = 0;

		while (true) {
			System.out.println("");
			System.out.println("\t\t\t\t\t|\t\t \t\t\t\t\t\t |\t\t(5) 비디오 정보 ");
			System.out.println("(1) 비디오 대여\t\t|\t\t(3) 비디오 코드 등록 \t\t | \t\t(6) 회원 정보");
			System.out.println("(2) 비디오 반납\t\t|\t\t(4) 회원 등록\t\t\t | \t\t(7) 종료");
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
				ve.waytoEnrollVdoCode();
				break;
			case 4:
				ve.waytoEnrollMem();
				break;
			case 5:
				ve.vdoInfo();
				break;
			case 6:
				ve.memInfo();
				break;
			case 7:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("메뉴 잘못 선택함. 다시 선택바람");
			}
		}
	}
}
