package mc.sn.day8;

public class DataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test()호출하는 코드 작성
		DataMain dm = new DataMain();
		dm.test();
	}
	//csv파일은 콤마로 구분된 데이터를 가지고 있는 파일이라는 뜻
	public void test() {
		System.out.println("문자열 데이터 처리");
		String data = "kim,54,84,62"; //token/토큰
		String[] temp = data.split(",");
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		//Kim이라는 학생이 받은 총점을 출력해 보세요
		int total = 0;
		try {
			total = Integer.parseInt(temp[1])+Integer.parseInt(temp[2])+Integer.parseInt(temp[3]);
	} catch (NumberFormatException ne) {
		System.out.println("예외발생");
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
