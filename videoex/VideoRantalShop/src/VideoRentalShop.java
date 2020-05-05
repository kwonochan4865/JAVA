import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class VideoRentalShop {//���� ��Ż �� Ŭ����
	private Vector<Member> vecMem = new Vector<Member>();
	private Vector<VideoTitle> vecVdoTt = new Vector<VideoTitle>();
	private Vector<Video> vecVdo = new Vector<Video>();
	private Vector<Rental> vecRental = new Vector<Rental>();
	
	public void rentalVideo(){//���� ������ �޼ҵ�
		if(this.vecMem.isEmpty() || this.vecVdo.isEmpty()){
			System.out.println("���̳� ������ ��ϵǾ����� �ʽ��ϴ�.");
			return;
		}
		int memSelect;
		int videoSelect;
		int rentalDay;
		System.out.println("���� �뿩 ����Դϴ�.");
		printMemberList();
		System.out.print("�뿩�� ���� ������ �ּ��� : ");
		memSelect = new Scanner(System.in).nextInt();
		
		printVideoList();
		
		System.out.print("�뿩�� ������ ������ �ּ��� : ");
		
		while(true){//������ ������ �뿩�Ǿ����� ��� ��� �ƴϸ� ���� Ż��
			videoSelect = new Scanner(System.in).nextInt();
			if(this.vecVdo.get(videoSelect).getIsRental() == true)
				System.out.println("�̹� �뿩�� �����Դϴ�.");
			else
				break;
		}
		
		System.out.print("�뿩�� �Ⱓ�� �Է��� �ּ��� : ");
		rentalDay = new Scanner(System.in).nextInt();
		
		vecRental.add(new Rental(vecMem.get(memSelect), vecVdo.get(videoSelect), new Date(), rentalDay));//���� ��Ż ���Ϳ�  �߰�
		vecVdo.get(videoSelect).rented(vecMem.get(memSelect));
		vecMem.get(memSelect).setPointUp();
		
		if(vecMem.get(memSelect).getPoint() >= GradeStandard.GOLD)			vecMem.get(memSelect).setGrade(GoldGrade.getInstance());
		else if(vecMem.get(memSelect).getPoint() >= GradeStandard.SILVER)	vecMem.get(memSelect).setGrade(SilverGrade.getInstance());
		else if(vecMem.get(memSelect).getPoint() >= GradeStandard.BRONZE)	vecMem.get(memSelect).setGrade(BronzeGrade.getInstance());
		
	}
	
	public void returnVideo(){//���� �ݳ� �޼ҵ�
		if(this.vecRental.isEmpty()){
			System.out.println("�ݳ��� ������ �����ϴ�.");
			return;
		}
		
		int videoSelect;
		this.printRentalList();
		System.out.print("�ݳ��� ������ ������ �ּ��� : ");
		videoSelect = new Scanner(System.in).nextInt();
		
		for(int i = 0; i<vecVdo.size(); i++){
			if(vecVdo.get(i).getCode().equals(vecRental.get(videoSelect).getVideo().getCode())){
				vecVdo.get(i).returned();
			}
		}		
		vecRental.remove(videoSelect);
		System.out.println("������ �ݳ��Ǿ����ϴ�.");
	}
	
	public void printRentalList(){
		System.out.println("���� �뿩 ��Ȳ�Դϴ�.");
		for(int i=0; i<vecRental.size(); i++){
			System.out.print(""+i+ ". ");
			System.out.print(vecRental.get(i).getDate().getYear()+"�� ");
			System.out.print(vecRental.get(i).getDate().getMonth()+"�� ");
			System.out.print(vecRental.get(i).getDate().getDay()+"�� ");
			System.out.print(vecRental.get(i).getVideo().getCode()+" ");
			System.out.print(vecRental.get(i).getVideo().getVideoTitle().getTitle()+" ");
			System.out.print(vecRental.get(i).getVideo().getVideoTitle().getDirector()+" ");
			if(vecVdo.get(i).getIsRental())			System.out.print("OUT  ");
			else						   			System.out.print("IN ");
			if(vecVdo.get(i).getBorrower()==null)	System.out.print("  ");
			else									System.out.print(""+vecVdo.get(i).getBorrower().getName());			System.out.println();
			System.out.println();
		}
	}
	
	
	public void addMember(){
		boolean isAdd = vecMem.add(new Member());
		if(isAdd)
			System.out.println("���� �߰��Ǿ����ϴ�.");
		else
			System.out.println("�� �߰��� �����߽��ϴ�.");
	}
	
	public void addVideoTitle(){
		boolean isAdd = vecVdoTt.add(new VideoTitle());
		if(isAdd)
			System.out.println("���� Ÿ��Ʋ�� �߰��Ǿ����ϴ�.");
		else
			System.out.println("���� Ÿ��Ʋ �߰��� �����Ͽ����ϴ�.");
	}
	
	public void addVideo(){
		if(this.vecVdoTt.isEmpty()){
			System.out.println("Ÿ��Ʋ�� ��ϵǾ����� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("���� Ÿ��Ʋ ����Ʈ�� ����մϴ�.");
		this.printVideoTitleList();
		System.out.print("���� ��ȣ�� �������ּ��� :");
		
		int select = new Scanner(System.in).nextInt();
		boolean isAdd = vecVdo.add(new Video(vecVdoTt.get(select)));
		if(isAdd)
			System.out.println("����"+vecVdoTt.get(select).getTitle()+"�� �߰��Ǿ����ϴ�.");
		else
			System.out.println("���� �߰��� �����Ͽ����ϴ�.");
	}
	
	public void printMemberList(){
		if(this.vecMem.isEmpty()){
			System.out.println("��ϵ� �ɹ��� �����ϴ�. �ɹ��� �߰����ּ���.");
			return;
		}
		
		System.out.println("��ȣ  ���̵�  �̸�  �ڵ�����ȣ  ����Ʈ  ȸ�����");
		
		for(int i=0; i<vecMem.size(); i++){
			System.out.print(""+i+ ". ");
			System.out.print(vecMem.get(i).getId()+" ");
			System.out.print(vecMem.get(i).getName()+" ");
			System.out.print(vecMem.get(i).getPhoneNum()+" ");
			System.out.print(vecMem.get(i).getPoint()+" ");
			System.out.print(vecMem.get(i).getGrade().getStrGrade()+" ");
			System.out.println();
		}
	}
		
	public void printVideoTitleList(){
		if(this.vecVdoTt.isEmpty()){
			System.out.println("���� Ÿ��Ʋ�� ������ϴ�. ���� Ÿ��Ʋ�� �߰����ּ���.");
			return;
		}
		
		System.out.println("��ȣ  �����⵵  ��������  ����");
		
		for(int i=0; i<vecVdoTt.size(); i++){
			System.out.print(""+i+ ". ");
			System.out.print(vecVdoTt.get(i).getYear()+" ");
			System.out.print(vecVdoTt.get(i).getTitle()+" ");
			System.out.print(vecVdoTt.get(i).getDirector()+" ");
			System.out.println();
		}	
	}
	
	public void printVideoList(){
		if(this.vecVdo.isEmpty()){
			System.out.println("���� ����Ʈ�� ������ϴ�. ������ �߰����ּ���.");
			return;
		}
		System.out.println("��ȣ  �ڵ�   �����⵵    ��������   ����   �뿩����   �뿩�ѻ��");
		for(int i=0; i<vecVdo.size(); i++){
			System.out.print(""+i+ ". ");
			System.out.print(vecVdo.get(i).getCode()+" ");
			System.out.print(vecVdo.get(i).getVideoTitle().getYear()+" ");
			System.out.print(vecVdo.get(i).getVideoTitle().getTitle()+" ");
			System.out.print(vecVdo.get(i).getVideoTitle().getDirector()+" ");
			if(vecVdo.get(i).getIsRental())			System.out.print("OUT  ");
			else						   			System.out.print("IN ");
			if(vecVdo.get(i).getBorrower()==null)	System.out.print("  ");
			else									System.out.print(""+vecVdo.get(i).getBorrower().getName());
			System.out.println();
			}
	}
	
	
	
	public static void main(String[] args){
		VideoRentalShop vrs = new VideoRentalShop();
		Scanner sc = new Scanner(System.in);
		int sltMenu = 0;
		
		while(true){
			System.out.println("");
			System.out.println("================�����뿩��=======================");
			System.out.println("(1). ���� �뿩        (2). ���� �ݳ�");
			System.out.println("(3). ���� ����Ʈ ��� (4). Ÿ��Ʋ ����Ʈ ���");
			System.out.println("(5). ���� �뿩 ��Ȳ   (6). �� ����Ʈ ���");
			System.out.println("(7). �� �߰�          (8). ���� Ÿ��Ʋ �߰� ");
			System.out.println("(9). ���� �߰�        (0). ���α׷� ����");
			System.out.print("*** �޴��� �Է����ּ��� *** : ");
			try{
				sltMenu = sc.nextInt();
			}catch(InputMismatchException ime){
				System.err.println("����! ������ �ƴ� �Ǽ�/���ڸ� �Է��ϼ̽��ϴ�.");
			}
			System.out.println("");
			
			switch(sltMenu){
			case 1: vrs.rentalVideo(); break;
			case 2: vrs.returnVideo(); break;
			case 3: vrs.printVideoList(); break;
			case 4: vrs.printVideoTitleList(); break;
			case 5: vrs.printRentalList(); break;
			case 6: vrs.printMemberList(); break;
			case 7: vrs.addMember(); break;
			case 8: vrs.addVideoTitle(); break;
			case 9: vrs.addVideo(); break;
			case 0: System.out.println("���α׷��� �����մϴ�...."); return;
			default : System.out.println("�߸��� �޴��� �����ϼ̽��ϴ�. �ٽ� �������ּ���.");
			}
		}
	}
}
