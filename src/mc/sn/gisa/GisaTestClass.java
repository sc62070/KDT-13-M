package mc.sn.gisa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GisaTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GisaTestClass gisa = new GisaTestClass();
		gisa.startTest();
	}
	
	public void startTest() {
		
		Student student = new Student("./data/Abc1115.csv");
		String ans1 = student.solveNo1();
		this.saveFile(ans1,1);
//		String ans2 = student.solveNo2();
//		this.saveFile(ans2,2);
//		String ans3 = student.solveNo3();
//		this.saveFile(ans3,3);
//		String ans4 = student.solveNo4();
//		this.saveFile(ans4,4);
	}
	
	private void saveFile(String ans, int no) {
		// 정답파일 생성
		String filePath = "./data/Ans"+no+".txt";
		File file = new File(filePath);
		
		FileWriter fw = null;
		PrintWriter pw = null;
	
		try {
			fw = new FileWriter(file);
			pw = new  PrintWriter(fw);
			pw.println(ans);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				pw.close();
				fw.close();
			} catch(IOException ie) {
				ie.printStackTrace();
			}
		}
	
		System.out.println(no+"번째 정답을 ans"+no+".txt 파일에 저장했습니다.");
	}

}
