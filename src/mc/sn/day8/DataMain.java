package mc.sn.day8;

public class DataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test()ȣ���ϴ� �ڵ� �ۼ�
		DataMain dm = new DataMain();
		dm.test();
	}
	//csv������ �޸��� ���е� �����͸� ������ �ִ� �����̶�� ��
	public void test() {
		System.out.println("���ڿ� ������ ó��");
		String data = "kim,54,84,62"; //token/��ū
		String[] temp = data.split(",");
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		//Kim�̶�� �л��� ���� ������ ����� ������
		int total = 0;
		try {
			total = Integer.parseInt(temp[1])+Integer.parseInt(temp[2])+Integer.parseInt(temp[3]);
	} catch (NumberFormatException ne) {
		System.out.println("���ܹ߻�");
	}
	
	System.out.println(total);
	}

	public void test2() {
		String data1 = "kim,54,84,62";
		String data2 = "lee,39,98,61";
		String data3 = "park,84,51,90";
		String data4 = "choi,61,78,52";
		String data5 = "koo,94,48,91";
		String[] scores = {data1,data2,data3,data4,data5};
		ScoreSheet[] sheets= new ScoreSheet[5];
		for(int i=0;i<scores.length;i++) {
			String[] temp = scores[i].split(",");
			sheets[i] = new ScoreSheet(temp[0],temp[1],temp[2],temp[3]);
		}
		
		for(int i=0;i<sheets.length;i++) {
			System.out.println(sheets[i].getName());
			System.out.println(sheets[i].getTotal());
			
			//System.out.println(sheets[i].getKor()+sheets[i].getEng()+sheets[i].getMath());
		}
	}
}
