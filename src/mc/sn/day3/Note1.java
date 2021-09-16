package mc.sn.day3;

public class Note1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = 10;
		//int y = 10;
		//System.out.println("x++:"+x++);
		//System.out.println("++y:"+(++y));
		//System.out.println();
		//System.out.println();
		
	//1에서 1씩 증가하는 수를 더해서 합이 125이상 될때 멈추는 코드를 작성하시오.
		int val = 1;
		int sum = 0;
		while(true) {
			//for (int i=0;i<125;i++) 
				sum = sum + val;
				if(sum>=125){
					break;
					
			}
				val = val +1;
			
		}
		System.out.print(sum);
	}

}
