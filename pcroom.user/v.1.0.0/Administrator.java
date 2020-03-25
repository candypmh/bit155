package pcroom.user;

import java.util.List;
import java.util.Scanner;

import pcroom.Internet_Cafe;
import pcroom.product.Product;
import pcroom.*;

public class Administrator extends User{
	Scanner sc = new Scanner(System.in);
	

	public void addProduct() {
		System.out.println("1. 음식추가    2. 음료수추가    3. 시간추가   4. 종료하기 ");

		int add_p = sc.nextInt();
		sc.nextLine();
		
		switch (add_p) {
		case 1: 
			break;
			
		case 2: 
		break;
		
		case 3: 
			break;
		
		case 4: System.out.println("이용해주셔서 감사합니다");
				showMain();

		default: System.out.println("잘못된 메뉴입니다. 다시 입력해주세요. ");
		break;
		}

	}

	public void delProduct() {

	}

	public void showToTalMoney() {

	}

	public void showUserList() {
		// 유저의 목록을 보여준다
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
