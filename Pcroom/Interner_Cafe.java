package pcroom;
import pcroom.user.*;


import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import pcroom.product.Product;
import pcroom.user.Customer;
import pcroom.user.Nonmember;
import pcroom.user.User;

public class Internet_Cafe {
	private List<Product> foodlist;
	
	private static final int MAX_ROW_INDEX = 5;
	private static final int MAX_COL_INDEX = 4;
	private Customer[][] seat = new Customer[MAX_ROW_INDEX][MAX_COL_INDEX];  //5x4배열
	private HashMap<String, Member> memberlist;
	private List<Nonmember> nonmember;
	
	Scanner sc = new Scanner(System.in);

	
	
	
	
	
	//처음 메인화면
	public void showMain() {
		System.out.println("=====어서오세요 4조피시방=====");
		System.out.println("이용하려면 아무키나 입력하세요: ");
		String touch = sc.nextLine();
		
		if (touch.equals("admin") == true) adminMenu();	
		showSeat();
	}
	

	
	
	
	
	public void addMember(Scanner sc) {
		// hashmap짜고
	}

	public void addMember() {// 비회원 카드
		//
	}
	
	
	
	
	
	
	
	
	//===============
	public void seatReset() { //좌석 초기화
		for(int i = 0; i < this.seat.length; i++) {
			for(int j = 0; j <this.seat[0].length;j++) {
				this.seat[i][j] = null;
			}
		}
	
	}
	//===============
	//?????왜 다 이용중이라 뜨지->해결됨
	public void showSeat() {  //좌석 보여주기
		seatReset();
		for(int i = 0; i <seat.length; i++) {
			for(int j = 0; j <seat[i].length; j++) {
				System.out.printf("[%s]",seat[i][j]==null? "이용가능":"이용중");
				
			
			}
			
			System.out.println();
				
			}
			selectSeat();
		}
		
	//===============

	public void selectSeat() {
		int row = 0;
		int col = 0;
		
		do {
			
			try {
				
		
		System.out.println("=====좌석을 선택해주세요=====");
		System.out.print("ex) 1,3: ");
		String inputSeat = sc.nextLine();
		String[] seatArr = inputSeat.trim().replace(" ", "").split(",");
		
		row = Integer.parseInt(seatArr[0])-1; //인덱스입력이니까
		col = Integer.parseInt(seatArr[1])-1; //인덱스입력이니까
		
		if(row >MAX_ROW_INDEX||col>MAX_COL_INDEX) {
			throw new Exception(); //배열을 벗어난 자리
		}
		
		if(seat[row][col]==null) {
			//seat[row][col] =    ->  ,기준으로 나눠서  int로 바꾸고 row랑 col에 넣을수있게!!
			System.out.println("좌석선택 완료");
			selectCustomer();
			
			
			
			
		
		}else {
			throw new Exception(); //이미 예약된 자리
		}
		
		
		} catch (Exception e) {
			System.out.println("좌석을 선택할 수 없습니다. 다시 선택해주세요");
			System.out.println("(1,1)부터 (5,4)까지의 좌석만 존재합니다.");
		}
		
		
		
		}while(true);
		
	}
	
	
	//===============
	public void selectCustomer(){ //회원 메뉴선택
		 while(true) {
			System.out.println("1. 회원");
			System.out.println("2. 비회원");
			System.out.println("3. 종료");
			
			int s_c_key = sc.nextInt();
			sc.nextLine();
			
			
		 switch (s_c_key) {
			case 1: selectMember();
				break;
				
			case 2: selectNonMember();
			break;
			
			case 3: System.out.println("이용해주셔서 감사합니다");
					showMain();

			default: System.out.println("잘못된 메뉴입니다. 다시 입력해주세요. ");
			break;
			}
		
		}
		
	}
	//===============
	
	public void selectMember() {
		
		
	}
	
	public void selectNonMember() {
		while(true) {
			System.out.println("1. 카드발급");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			
			int s_c_key = sc.nextInt();
			sc.nextLine();
			
			
		 switch (s_c_key) {
			case 1: int cardnum =((int)(Math.random()*20) + 1);
				break;
				
			case 2: selectNonMember();
			break;
			
			case 3: System.out.println("이용해주셔서 감사합니다");
					showMain();

			default: System.out.println("잘못된 메뉴입니다. 다시 입력해주세요. ");
			break;
			}
		
		}
		
		
	}




	public void adminMenu() {
		System.out.println("관리자 페이지입니다.");
		System.out.println("비밀번호를 입력해주세요>> ");
		String admin_pw = sc.nextLine();
		
		//비번이 맞으면 관리자메뉴 오픈
		if(admin_pw.equals("admin") == true) {
			Administrator admin = new Administrator();
			System.out.println("1. 메뉴추가    2.메뉴삭제    3.정산   4.이용자명단");
			int admin_select = sc.nextInt();
			sc.nextLine();
		
			
			switch (admin_select) {
    
			case 1: admin.addProduct();
				break;
				
			case 2: admin.delProduct();
			break;
			
			case 3: admin.showToTalMoney();
			break;
			
			case 4: admin.showUserList();
			break;
			
			case 5: System.out.println("이용해주셔서 감사합니다");
			showMain();

			default:System.out.println("잘못된 메뉴입니다. 다시 입력해주세요. ");
			break;
			
     }
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	


}
