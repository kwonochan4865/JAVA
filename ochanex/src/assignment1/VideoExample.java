package assignment1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class VideoExample {
	private Vector<VideoinfoWrite> vecEnroll = new Vector<VideoinfoWrite>();
	private Vector<Rental> vecRental = new Vector<Rental>();
	private Vector<VideoCode> vecCode = new Vector<VideoCode>();
	private Vector<MeminfoWrite> vecMem = new Vector<MeminfoWrite>();
	VideoinfoRead vi = new VideoinfoRead();

	public void ok() throws IOException {
	}

//	public Vector<VideoinfoWrite> getvecEnroll() {
//		return vecEnroll;
//	}
//
//	public void setvecEnroll(Vector<VideoinfoWrite> vecEnroll) {
//		this.vecEnroll = vecEnroll; // 비디오 정보를 밖으로 호출하기 위해 필요
//	}

//-----------------------------------------------------------------------------------------------------------------
/////////////////////////////////(1) 비디오 대여 
	public void rentalVideo() throws IOException {
		if (this.vecEnroll.isEmpty()) {
			System.out.println("비디오 등록돼 있지 않습니다. 등록 후 사용하실 수 있습니다.");
			return;
		}
		int vdoSelect;
		int memSelect;
		int rantalPeriod;
		System.out.println("비디오 대여");
//		memInfo();
		System.out.print("대여할 고객을 선택해 주세요 : ");
		memSelect = new Scanner(System.in).nextInt();

		vdoInfo();

		System.out.print("대여할 비디오를 선택해주세요");

//		while(true)
//			vdoSelect = new Scanner(System.in).nextInt();
//		if(this.vp.get(vdoSelect).isRental() == true)
//			System.out.println("이미 대여된 비디오입니다.");
//		else
//			break;
	}

////////////////////////////////////(2) 비디오 반납
	public void returnVideo() {
//		if (this.vecRental.isEmpty()) {
//			System.out.println("반납할 비디오가 없습니다.");
//			return;
//		}
//
//		int vdoSelect;
//		this.enrollinfo();
//		System.out.print("반납할 비디오를 선택해 주세요 : ");
//		vdoSelect = new Scanner(System.in).nextInt();
//		for(int i = 0; i<vecEnroll.size(); i++){
//			if(vecEnroll.get(i).getBarcodenum().equals(vecRental.get(vdoSelect).getVideo().getCode())){
//				vecEnroll.get(i).returned();
//			}
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

/////////////////////////////(4) 회원 등록 과정
	public void waytoEnrollMem() throws IOException {
		boolean isEnroll = vecMem.add(new MeminfoWrite());
		if (isEnroll)
			System.out.println("회원이 추가되었습니다.");
		else
			System.out.println("회원 추가를 실패하였습니다.");
	}

//-----------------------------------------------------------------------------------------------------------------
//////////////////////////////////////(5) 비디오 정보 
	public void vdoInfo() throws IOException {

//		VideoinfoRead vi = new VideoinfoRead();
		if (this.vecEnroll.isEmpty()) {
			System.out.println("비디오 등록이 되어 있지 않습니다. 추가 바랍니다.");
			return;
		}
		System.out.println("번호\t\t|\t\t제목\t\t|\t\t감독\t\t|\t\t\t바코드\t\t|\t\t개봉년도");
		int a = 1;
		for (int i = 0; i < vecEnroll.size(); i++) {
			System.out.print("" + i + a + ". ");
			System.out.print("              " + vecEnroll.get(i).getTitle() + "\t\t\t\t");
			System.out.print(vecEnroll.get(i).getDirector() + "\t\t\t\t");
			System.out.print(vecEnroll.get(i).getBarcodenum() + "\t\t\t\t");
			System.out.print(vecEnroll.get(i).getOpenyear());
			System.out.println();
		}
	}

//////////////////////////////////////////(6) 회원 정보 
	public void memInfo() {
		System.out.println("순번     회원 이름                    회원 전화번호");
		int a = 1;
		for (int i = 0; i < vecMem.size(); i++) {
			System.out.print("" + (i + a) + ".      ");
			System.out.print(vecMem.get(i).getName() + "             ");
			System.out.print(vecMem.get(i).getPhoneNum());
			System.out.println("");
		}
	}

	public void enrollinfo() {
		if (vecEnroll.isEmpty()) {
			System.out.println("대여된 비디오가 없습니다.");
		} else {
			Date set = new Date();
		}
	}

	public void Example() {
	}

//-----------------------------------------------------------------------------------------------------------------
/////////////////////////////////////////////////// main
	public static void main(String[] args) throws IOException {
		Date set = new Date();
		VideoExample ve = new VideoExample();
		Scanner sc = new Scanner(System.in);
		int sltMenu = 0;

		while (true) {
			System.out.println("");
			System.out.println("\t\t\t\t\t|\t\t \t\t\t\t\t\t |\t\t(5) 비디오 정보 ");
			System.out.println("(1) 비디오 대여\t\t|\t\t(3) 비디오 코드 등록 \t\t | \t\t(6) 회원 정보");
			System.out.println("(2) 비디오 반납\t\t|\t\t(4) 회원 등록\t\t\t | \t\t(7) 대여 정보");
			System.out.println();
			System.out.print("\t\t\t\t\t\t 메뉴를 입력바람/종료는 0번 ");
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
				ve.enrollinfo();
				break;
			case 0:
				return;
			default:
				System.out.println("메뉴 잘못 선택함. 다시 선택바람");
			}
		}
	}
}
