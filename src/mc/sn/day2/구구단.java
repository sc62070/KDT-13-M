package mc.sn.day2;

public class 구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2단을 만든것과 똑같이 9단까지 만드시오.
		for (int j=0; j<8; j++) {
			int number = j+2;
		for (int i=0;i<9;i++) {
			int value = i+1;
			System.out.print(value+"X"+number+"="+value*number+"\t");
		}
		System.out.println();
	}
	}

}
//처음에 2단을 위한 구구단을 만들었다.
//for (int i=0;i<9;i++) {
//int value = i+1;
//System.out.print("2"+"X"+number+"="+value*2);

//허나 9단까지 똑같이 만들기 위해서는 변수 j 를 집어넣어야된다.
//여기서 변수 j 는 2의 자리를 차지한다.

//그렇기에 for문 안에 for 문을 더 집어넣은것이다.
//그리고 이제 j변수가 바뀔때마다 칸을 나누기 위해서는 "\t"를 추가한다. 
//그리고 println 대신 print만 넣게되면 가로로 그 값이 나뉘게 된다.