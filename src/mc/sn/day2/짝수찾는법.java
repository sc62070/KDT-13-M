package mc.sn.day2;

public class 짝수찾는법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<10;i++) {
			int value = i+1;
			
			if (value%2==0) {
				System.out.println(value);
				// ==의 의미는 두 피연산자의 값이 같은지를 검사하는것이다. 그렇기에 짝수를 찾을수 있는것이다.
			}
		}

	}

}
