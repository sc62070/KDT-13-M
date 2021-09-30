package mc.sn.day7.review;

public class Account {
//	balance;//잔고 (정수)
//	owner;//계좌주 (문자열)
//	ano;//계좌번호 (문자열)
//}
//	필드(멤버변수) 상속,다형성,은닉성(information hiding)
//	은닉성을 적용하여 데이터 클래스를 구성하시오
	private int balance;//잔고 (정수)
	private String owner;//계좌주 (문자열)
	private String ano;//계좌번호 (문자열)
	public Account() {
	}
	//기본 생성자 만드세요
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

