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
		
	//1���� 1�� �����ϴ� ���� ���ؼ� ���� 125�̻� �ɶ� ���ߴ� �ڵ带 �ۼ��Ͻÿ�.
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
