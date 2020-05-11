package com.yedam.classes.statics;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Account[] accounts = new Account[100];
		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();//엔터값 하나 소비.
			//Account[] accounts = new Account[100];
			//Account acc1 = new Account("356-0512","김창현",1000000);
			if (menu == 1) {
				System.out.println("계좌생성 선택.");
				System.out.println("계좌번호를 입력하세요.");
				String ano = scn.nextLine();
				System.out.println("예금주 입력하세요.");
				String owner = scn.nextLine();
				System.out.println("예금액을 입력하세요.");
				int balance = scn.nextInt();
				Account acnt = new Account(ano, owner, balance);
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null) {
						accounts[i] = acnt;
						System.out.println(accounts[0].getAno());
						break;
					}
				} //이거 좋다. 나는 시작부분에 변수 하나 선언해서 menu 1씩 더하려고 했는데.
			} else if (menu == 2) {
				System.out.println("계좌목록 선택.");
				//전체 배열중에 값이 있는 경우에만 출력(null제외)
				//System.out.println(accounts[0].getAno());
				for (Account acc : accounts) {
					if (acc != null) {
						System.out.println(
								"계좌번호: " + acc.getAno() + ", 예금주: " + acc.getOwner() + ", 예금액: " + acc.getBalance());
					}
				}

			} else if (menu == 3) {
				System.out.println("예금선택.");
				System.out.println("계좌번호 입력하세요.");
				String ano = scn.nextLine();
				System.out.println("예금액 입력하세요.");
				int balance = scn.nextInt();
				//전체 배열 중 값이 있는 경우 && 입력 계좌번호와 동일한 건에 대해서만 처리.
				for(Account acc : accounts) {
					if(acc!=null && acc.getAno().equals(ano)) {
						int result = acc.getBalance();
						acc.setBalance(result + balance);
					}
				}
				System.out.println("예금 처리가 되었습니다.");
			} else if (menu == 4) {
				System.out.println("출금선택");
				System.out.println("계좌번호 입력하세요.");
				String ano = scn.nextLine();
				System.out.println("출금액 입력하세요.");
				int balance = scn.nextInt();
				for(Account acc : accounts) {
					if(acc!=null && acc.getAno().equals(ano)) {
						int result = acc.getBalance();
						acc.setBalance(result - balance);
					}
				}
				System.out.println("출금 처리가 되었습니다.");
				//acc1.setBalance(menu);
			} else if (menu == 5) {
				System.out.println("종료선택.");
				break;
			}
		} //end of while
		System.out.println("프로그램 종료.");
	}//end of main
}//end of class
