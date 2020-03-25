package pcroom.user;
/*

클래스이름:  Administrator 관리자
 
버전정보:  v.1.0
 
날짜: 2020 - 03 - 25
 
작업자: 박민혜

*/


import java.util.HashMap;

import java.util.List;
import java.util.Scanner;

import pcroom.Internet_Cafe;
import pcroom.product.Product;
import pcroom.*;

public class Administrator extends User{
	Scanner sc = new Scanner(System.in);
	
	//여기서...인터넷카페에있는 멤버리스트 뽑아와야하는데
	// memberlist.put("admin", Member);
	
	
	@Override
	void logCheck() {
		isLog();
	}
	
	
	
	//=========================
	public void addProduct() {
		System.out.println("1. 제품추가    2. 시간추가   3. 종료하기 ");

		int add_p = sc.nextInt();
		sc.nextLine();
		
		switch (add_p) {
		
//===========음식추가 음료추가가 나와야하는데..........
		case 1: 
			System.out.println("1. 음식추가    2. 음료추가   3. 돌아가기 ");
			
			int add_p_select = sc.nextInt();
			sc.nextLine();
			
			switch (add_p_select) {
			case 1: addFood();
				break;
				
			case 2: addDrink();
				break;
				
			case 3: addProduct();
				break;

			default: System.out.println("잘못된 메뉴입니다. 다시 입력해주세요. ");
				break;
			}

			break;
			
//===========
		case 2: addChargedTime();
		break;

		
		case 3: System.out.println("이용해주셔서 감사합니다");
				//showMain();

		default: System.out.println("잘못된 메뉴입니다. 다시 입력해주세요. ");
		break;
		}

	}
	
//===========

	
	private void addChargedTime() {
		//추가 어떻게하는데................어디다하는데..............?인터넷카페?????
		
	}



	private void addDrink() {
		// TODO Auto-generated method stub
		
	}



	private void addFood() {
		// TODO Auto-generated method stub
		
	}



	//==========================================================
	public void delProduct() {
		System.out.println("1. 제품삭제    2. 시간삭제   3. 종료하기 ");

		int del_p = sc.nextInt();
		sc.nextLine();
		
		switch (del_p) {
		
		case 1: 
			System.out.println("1. 음식삭제    2. 음료삭제   3. 돌아가기 ");
			
			int add_p_select = sc.nextInt();
			sc.nextLine();
			
			switch (add_p_select) {
			case 1: delFood();
				break;
				
			case 2: delDrink();
				break;
				
			case 3: delProduct();
				break;

			default: System.out.println("잘못된 메뉴입니다. 다시 입력해주세요. ");
				break;
			}

			break;
			
//===========
		case 2: delChargedTime();
		break;

		
		case 3: System.out.println("이용해주셔서 감사합니다");
				//showMain();

		default: System.out.println("잘못된 메뉴입니다. 다시 입력해주세요. ");
		break;
		}

	}

	
	
	private void delChargedTime() {
		// TODO Auto-generated method stub
		
	}



	private void delDrink() {
		// TODO Auto-generated method stub
		
	}



	private void delFood() {
		// TODO Auto-generated method stub
		
	}


	//==========================================================
	public void showToTalMoney() {

	}

	public void showUserList() {
		// 유저의 목록을 보여준다
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
