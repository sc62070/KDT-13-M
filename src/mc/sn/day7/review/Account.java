package mc.sn.day7.review;

public class Account {
//	balance;//�ܰ� (����)
//	owner;//������ (���ڿ�)
//	ano;//���¹�ȣ (���ڿ�)
//}
//	�ʵ�(�������) ���,������,���м�(information hiding)
//	���м��� �����Ͽ� ������ Ŭ������ �����Ͻÿ�
	private int balance;//�ܰ� (����)
	private String owner;//������ (���ڿ�)
	private String ano;//���¹�ȣ (���ڿ�)
	public Account() {
	}
	//�⺻ ������ ���弼��
	public Account(int balance,String owner,String ano) {
		this.balance =balance;
		this.owner = owner;
		this.ano = ano;
	}

	public void setBalance(int balance) {
		this.balance = balance;
}
	public int getBalance() {
		return this.balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	//toSt ctrl+space
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ano+" "+this.owner+" "+this.balance;
	}
}

