package mc.sn.day7.review;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test()호출하는 코드 작성하시오
		BankApplication ba = new BankApplication();
		ba.test();
	}

	//openBank라는 식별자의 기본 메소드 생성하세요
	public void openBank() {
		
	}
	
	//입금,출금,조회,계좌생성 작업을 하는 메소드 작성하시오

	public void deposit(Scanner scan) {
		
	}
	public void withdraw(Scanner scan) {
		
	}
	public void accountList() {
		
	}
	public void createAccount(Scanner scan) {
		
	}
	
	//test라는 식별자의 기본 메소드 생성하세요
	public void test() {
		//Account클래스를 인스턴스를 만들고 값을 셋팅하는 작업
		//1. 인스턴스가 생성되는 동시에 값 셋팅
		Account kim = new Account(10000,"kim","0001");
		//2. 인스턴스가 생성되고 난 후에 값 셋팅
		Account lee = new Account();
		lee.setAno("0002");
		lee.setOwner("lee");
		lee.setBalance(10000);
		
		System.out.println(kim);
		System.out.println(lee);
}
}