package mc.sn.baseball;

import java.util.Scanner;

public class Stadium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stadium stadium = new Stadium();
		stadium.playBall();
	}
	
	public void playBall() {
		BaseballGame game = new BaseballGame();
		System.out.println("���� ���� ���ھ߱������� �����մϴ�.");
		//���� ����
		// 4�ڸ��� ����
		System.out.println("4�ڸ����� �����Ǿ����ϴ�");
		String strike = null; //--> int ���� �� String���� �����Ͽ���?
		String ball = null;
		//����� quit ���ڿ� �Է��ϸ� ������ ������ �Ѵ�.
		String command = null;
		Scanner scan = new Scanner(System.in);
		//�������̽� �Է°� ����� ����ϴ� �κ�
		boolean isStop = false;
		while(!isStop) {
			System.out.print("�ߺ����� �ʴ� 4�ڸ����� �Է��ϼ���(�ߴ��� quit �Է�) >>");
			command = scan.nextLine();
			String result = game.guessNumber(command);
			if(result==null) {
				continue;
			}
			//strike = ""; //��� �ִ� ���ڿ��� �ʱ�ȭ
			strike = result.split(":")[0];
			ball = result.split(":")[1];
			System.out.println("�Է°���� "+strike+" ��Ʈ����Ʈ"+ball+" ���Դϴ�.");
			
			if(strike.equals("4")||command.equals("quit")) {
				isStop = true;
			}
			//�Է��� ���ڿ� ���� ���� ���
			
		
			

			
		}
 		scan.close();
		System.out.println("�̰����� ������ �����ϰڽ��ϴ�.");
	}

}
