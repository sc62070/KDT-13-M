package mc.sn.code;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test()?��출하?�� 코드 ?��?��?��?��?��
		BankApplication ba = new BankApplication();
		ba.test();
	}
	
	//openBank?��?�� ?��별자?�� 기본 메소?�� ?��?��?��?��?��
	public void openBank() {
		// ?���?(1), 출금(2), 조회(3), 계좌?��?��(4), 종료(5)
		boolean isClosed = false;
		// ?��보드?? ?��결하?�� 코드 ?��?��
		Scanner scan = new Scanner(System.in);
		while(!isClosed) {
			// ?��보드�? �??�� ?��?��?�� 받는 코드 ?��?��
			String command = scan.nextLine();
			//종료�? ?��?��?���? 반복�? 빠져?���??�� 코드 ?��?��
			if(command.equals("5")) {
				isClosed = true;
			} else if(command.equals("1")) {
				this.deposit(scan);
			} else if(command.equals("2")) {
				this.withdraw(scan);
			} else if(command.equals("3")) {
				this.accountList();
			} else if(command.equals("4")) {
				this.createAccount(scan);
			}
		}
		//?��보드?? ?��결종료하?�� 코드 ?��?��
		scan.close();
	}
	
	// ?���?, 출금, 조회, 계좌?��?�� ?��?��?�� ?��?�� 메소?�� ?��?��?��?��?��
	public void deposit(Scanner scan) {
		
	}
	
	public void withdraw(Scanner scan) {
		
	}
	
	public void accountList() {
		
	}
	
	public void createAccount(Scanner scan) {
		
	}
	
	private Account findAccount(String ano) {
		Account result = null;
		//리턴???���? 짝이 코드 ?��?��?��?��?��
		
		return result;
	}
	
	
	//test?��?�� ?��별자?�� 기본 메소?�� ?��?��?��?��?��
 	public void test() {
		//Account?��?��?���? ?��?��?��?���? 만들�? 값을 ?��?��?��?�� ?��?��
		//1. ?��?��?��?���? ?��?��?��?�� ?��?��?�� �? ?��?��
		Account kim = new Account(10000,"kim","0001");
		//2. ?��?��?��?���? ?��?��?���? ?�� ?��?�� �? ?��?��
		Account lee = new Account();
		lee.setAno("0002");
		lee.setOwner("lee");
		lee.setBalance(10000);
		
		System.out.println(kim);
		System.out.println(lee);
		
	}
	
	
	
	

}
