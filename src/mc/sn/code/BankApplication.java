package mc.sn.code;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test()?˜¸ì¶œí•˜?Š” ì½”ë“œ ?‘?„±?•˜?‹œ?˜¤
		BankApplication ba = new BankApplication();
		ba.test();
	}
	
	//openBank?¼?Š” ?‹ë³„ì?˜ ê¸°ë³¸ ë©”ì†Œ?“œ ?ƒ?„±?•˜?„¸?š”
	public void openBank() {
		// ?…ê¸?(1), ì¶œê¸ˆ(2), ì¡°íšŒ(3), ê³„ì¢Œ?ƒ?„±(4), ì¢…ë£Œ(5)
		boolean isClosed = false;
		// ?‚¤ë³´ë“œ?? ?—°ê²°í•˜?Š” ì½”ë“œ ?‘?„±
		Scanner scan = new Scanner(System.in);
		while(!isClosed) {
			// ?‚¤ë³´ë“œë¡? ë¶??„° ?…? ¥?„ ë°›ëŠ” ì½”ë“œ ?‘?„±
			String command = scan.nextLine();
			//ì¢…ë£Œê°? ?…? ¥?˜ë©? ë°˜ë³µë¬? ë¹ ì ¸?‚˜ê°??Š” ì½”ë“œ ?‘?„±
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
		//?‚¤ë³´ë“œ?? ?—°ê²°ì¢…ë£Œí•˜?Š” ì½”ë“œ ?‘?„±
		scan.close();
	}
	
	// ?…ê¸?, ì¶œê¸ˆ, ì¡°íšŒ, ê³„ì¢Œ?ƒ?„± ?‘?—…?„ ?•˜?Š” ë©”ì†Œ?“œ ?ƒ?„±?•˜?‹œ?˜¤
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
		//ë¦¬í„´???…ê³? ì§ì´ ì½”ë“œ ?‘?„±?•˜?‹œ?˜¤
		
		return result;
	}
	
	
	//test?¼?Š” ?‹ë³„ì?˜ ê¸°ë³¸ ë©”ì†Œ?“œ ?ƒ?„±?•˜?„¸?š”
 	public void test() {
		//Account?´?˜?Š¤ë¥? ?¸?Š¤?„´?Š¤ë¥? ë§Œë“¤ê³? ê°’ì„ ?…‹?Œ…?•˜?Š” ?‘?—…
		//1. ?¸?Š¤?„´?Š¤ê°? ?ƒ?„±?˜?Š” ?™?‹œ?— ê°? ?…‹?Œ…
		Account kim = new Account(10000,"kim","0001");
		//2. ?¸?Š¤?„´?Š¤ê°? ?ƒ?„±?˜ê³? ?‚œ ?›„?— ê°? ?…‹?Œ…
		Account lee = new Account();
		lee.setAno("0002");
		lee.setOwner("lee");
		lee.setBalance(10000);
		
		System.out.println(kim);
		System.out.println(lee);
		
	}
	
	
	
	

}
