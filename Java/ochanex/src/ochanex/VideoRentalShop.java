package ochanex;
import java.util.*;

public class VideoRentalShop {
	private Vector<Code> vecCode = new Vector<Code>();
	private Vector<Member> vecMem = new Vector<Member>();
	private Vector<Video> vecVdo = new Vector<Video>();
////////////////////////////////////////////////////////////////////////////////
//////////////////////////// (1) rentalVideo
	public void rentalVideo() {
		if(this.vecVdo.isEmpty()) {
			System.out.println("비디오가 등록되어 있지 않습니다.");
			return;
		}
		int memSelect;
		
			printMemberList();
			System.out.print("대여할 고객을 선택해 주세요 : ");
			memSelect = new Scanner(System.in).nextInt();
		}

	
////////////////////////////////////////////////////////////////////////////////
///////////////////////////// (2) return
	public void returnVideo() {
		if(this.vecRental.isEmpty()) {
			System.out.println("반납할 비디오가 없음");
			return;
		}
		int videoSelect;
		this.printRentalList();
		
	}
	public static void main(String[] args) {
//	System.out.println("                           ");
//	System.out.println("                           ");
//	System.out.println("             " + "대여/반납");
//	System.out.println("        " + "(Enter를 눌러주세요)");
//	System.out.println("                           ");
//	System.out.println("                           ");
		VideoRentalShop vrs = new VideoRentalShop();
	System.out.println(" 대여/반납은 1번 | 현황 출력 2번  | 추가는 3번을 입력해주세요.");

		 int uiinput = new Scanner(System.in).nextInt();

		 if(uiinput == 1) {
			 System.out.println("(1). 대여 여부         (2). 비디오 등록 현황");
			 System.out.println("(3). 코드 등록 현황     (4). 맴버 현황 ");
			 int presentinput = new Scanner(System.in).nextInt();
			 switch(presentinput) {
			 case 1: vrs.printRentalList(); break;
			 case 2: vrs.printVideoList(); break;
			 case 3: vrs.printCodeList(); break;
			 case 4: vrs.printMemberList(); break;
			 }
 
		 	}
 
 
		 if(uiinput == 2) {
			 System.out.println("(1). 비디오 추가         (2). 맴버 추가 ");
			 System.out.println("(3). 코드 추가");
			int sltMenu = new Scanner(System.in).nextInt();
				if(sltMenu == 1) {
					vrs.addVideo(); break;
				if(sltMenu == 2) {
					vrs.addMember(); break;
				}
				}
		 	}
 
 
		 else
			 System.out.println("1번, 2번 또는 3번을 눌러주세요");
		 	 return;
	}
} 

