package mc.sn.day3;

public class IfBreakContinue {

public static void main(String[] args) {
	for(int i=0;i<10;i++) {
		int number = i+1;
		if(number==6) {
			//break; //stops at 5
			//continue; //6 disappears
		}
		System.out.println(number);
}

}

}