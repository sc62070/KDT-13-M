package mc.sn.day7;

public class AccountMain {
	public static void main(String[] args) {
		//test1() ȣ��
		AccountMain am = new AccountMain();
		am.test1();
	}
	public void test1() {
		//Account ��ü �����ϰ� ���� �����ϼ���
		Account kim = new Account();
		kim.setBalance(1000);
		kim.setAno("1111");
		kim.setOwner("kim");
		System.out.println(kim);
		Account lee = new Account("2222","lee",100000);
		System.out.println(lee);
//		System.out.println(kim.getBalance());
//		System.out.println(kim.getAno());
//		System.out.println(kim.getOwner());
	}
	}
