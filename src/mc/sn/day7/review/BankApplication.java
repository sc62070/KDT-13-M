package mc.sn.day7.review;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test()ȣ���ϴ� �ڵ� �ۼ��Ͻÿ�
		BankApplication ba = new BankApplication();
		ba.test();
	}

	//openBank��� �ĺ����� �⺻ �޼ҵ� �����ϼ���
	public void openBank() {
		
	}
	
	//�Ա�,���,��ȸ,���»��� �۾��� �ϴ� �޼ҵ� �ۼ��Ͻÿ�

	public void deposit(Scanner scan) {
		
	}
	public void withdraw(Scanner scan) {
		
	}
	public void accountList() {
		
	}
	public void createAccount(Scanner scan) {
		
	}
	
	//test��� �ĺ����� �⺻ �޼ҵ� �����ϼ���
	public void test() {
		//AccountŬ������ �ν��Ͻ��� ����� ���� �����ϴ� �۾�
		//1. �ν��Ͻ��� �����Ǵ� ���ÿ� �� ����
		Account kim = new Account(10000,"kim","0001");
		//2. �ν��Ͻ��� �����ǰ� �� �Ŀ� �� ����
		Account lee = new Account();
		lee.setAno("0002");
		lee.setOwner("lee");
		lee.setBalance(10000);
		
		System.out.println(kim);
		System.out.println(lee);
}
}