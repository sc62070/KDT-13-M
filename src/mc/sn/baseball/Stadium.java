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
		System.out.println("지금 부터 숫자야구게임을 시작합니다.");
		//게임 시작
		// 4자리수 생성
		System.out.println("4자리수가 생성되었습니다");
		String strike = null; //--> int 에서 왜 String으로 변경하였나?
		String ball = null;
		//기권은 quit 문자열 입력하면 가능한 것으로 한다.
		String command = null;
		Scanner scan = new Scanner(System.in);
		//인터페이스 입력과 결과를 출력하는 부분
		boolean isStop = false;
		while(!isStop) {
			System.out.print("중복되지 않는 4자리수를 입력하세요(중단은 quit 입력) >>");
			command = scan.nextLine();
			String result = game.guessNumber(command);
			if(result==null) {
				continue;
			}
			//strike = ""; //비어 있는 문자열로 초기화
			strike = result.split(":")[0];
			ball = result.split(":")[1];
			System.out.println("입력결과는 "+strike+" 스트라이트"+ball+" 볼입니다.");
			
			if(strike.equals("4")||command.equals("quit")) {
				isStop = true;
			}
			//입력한 숫자에 대한 판정 출력
			
		
			

			
		}
 		scan.close();
		System.out.println("이것으로 게임을 종료하겠습니다.");
	}

}
