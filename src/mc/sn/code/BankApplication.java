package mc.sn.code;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test()?ΈμΆν? μ½λ ??±???€
		BankApplication ba = new BankApplication();
		ba.test();
	}
	
	//openBank?Ό? ?λ³μ? κΈ°λ³Έ λ©μ? ??±??Έ?
	public void openBank() {
		// ?κΈ?(1), μΆκΈ(2), μ‘°ν(3), κ³μ’??±(4), μ’λ£(5)
		boolean isClosed = false;
		// ?€λ³΄λ?? ?°κ²°ν? μ½λ ??±
		Scanner scan = new Scanner(System.in);
		while(!isClosed) {
			// ?€λ³΄λλ‘? λΆ??° ?? ₯? λ°λ μ½λ ??±
			String command = scan.nextLine();
			//μ’λ£κ°? ?? ₯?λ©? λ°λ³΅λ¬? λΉ μ Έ?κ°?? μ½λ ??±
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
		//?€λ³΄λ?? ?°κ²°μ’λ£ν? μ½λ ??±
		scan.close();
	}
	
	// ?κΈ?, μΆκΈ, μ‘°ν, κ³μ’??± ??? ?? λ©μ? ??±???€
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
		//λ¦¬ν΄???κ³? μ§μ΄ μ½λ ??±???€
		
		return result;
	}
	
	
	//test?Ό? ?λ³μ? κΈ°λ³Έ λ©μ? ??±??Έ?
 	public void test() {
		//Account?΄??€λ₯? ?Έ?€?΄?€λ₯? λ§λ€κ³? κ°μ ???? ??
		//1. ?Έ?€?΄?€κ°? ??±?? ??? κ°? ??
		Account kim = new Account(10000,"kim","0001");
		//2. ?Έ?€?΄?€κ°? ??±?κ³? ? ?? κ°? ??
		Account lee = new Account();
		lee.setAno("0002");
		lee.setOwner("lee");
		lee.setBalance(10000);
		
		System.out.println(kim);
		System.out.println(lee);
		
	}
	
	
	
	

}
