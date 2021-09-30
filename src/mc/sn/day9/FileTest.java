package mc.sn.day9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		FileTest ft = new FileTest();
		try {
			ft.test2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test1() {
		File file = new File("./data/Abc1115.csv");
		if(file.exists()) {
			String name = file.getName();
			long size = file.length();
			System.out.println(name+":"+size);
		} else {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
	}
		
	public void test2() throws IOException {
		//������ �������� ���� : ��Ʈ�� ����
		File file = new File("./data/Abc1115.csv");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line=br.readLine())!=null) {
			System.out.println(line);	
		}
		br.close();
		fr.close();
	}

}
