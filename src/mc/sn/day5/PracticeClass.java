package mc.sn.day5;
import java.util.Random;
public class PracticeClass {
	
	public void testString1() {
		String str1 = new String("Hello");
		System.out.println(str1);
		String str2 = "Hello";
		System.out.println(str2);
		int a = 3;
		int b = 3;
		if(str1==str2) {
			System.out.println("a==b");
		}else {
			System.out.println("a!=b");
		}
		if(str1.equals(str2)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
	}
	
 public void testClass1() {
	 System.out.println("testClass1");
	 //�������� ���Ҷ� ����ϴ� Ŭ���� RandomŬ���� �Դϴ�.
	 Random r = new Random();
	 int rnd = r.nextInt(45); //0<=rnd<45
	 System.out.println(rnd);
 }
 
 public void getNumbers() {
	 //1~45������ �������� 6���� ���Ͽ� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
	 int[] numbers = new int[6];
	 for(int i=0;i<6;i++) {
		Random r = new Random();
	 	int rnd = r.nextInt(45)+1;
	 	numbers[i] = rnd;
	 	System.out.println(rnd);
	 }
	 for(int i=0;i<numbers.length;i++) { //length�� �迭�� ũ�� ���� new int[6] <-- �̰�
		 System.out.print(numbers[i]+" ");
	 }
 }
	 
	 public void getNumbersV2() {
		 //1~45������ �������� 6���� ���Ͽ� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		 int[] numbers = new int[6];
		 boolean flag = false;
		 int count = 0;
		 while(!flag) {
			Random r = new Random();
		 	int rnd = r.nextInt(45)+1;
		 	//�ߺ��� �ƴҶ� �Ʒ� ���� ����
		 	//�迭 �˻��ؼ� ���� ���ڰ� ������
		 	boolean checkNumber =false;
		 	for(int i=0;i<count;i++) {
		 		if(numbers[i]==rnd) {
		 			checkNumber = true;
		 			System.out.println("�ߺ�:"+rnd);
		 			break;
		 		}
		 	}
		 	if(!checkNumber) {
		 		numbers[count] = rnd;
		 		count = count + 1;
		 	
		 	} 
		 	
		 	System.out.println(rnd);
		 	//6���� ��� �����ߴٸ�
		 	if(count==6) {
		 		flag = true;
		 	}
		 }
		 for(int i=0;i<numbers.length;i++) { //length�� �迭�� ũ�� ���� new int[6] <-- �̰�
			 System.out.print(numbers[i]+" ");
		 }
	 
/*�迭�� ������ �ο��Ѵ�. 
 * �迭�� ���� ���� ������ �����Ѵ�.
 * �迭���� ���ŵ� ���ڴ� �ٽ� ������ �ο��Ѵ�.
 * �� �迭�� �������� �Ȱ��� ���ڰ� �ִ��� Ȯ���Ѵ�.boolean true or false
 * ���ѹݺ��ϰ� true�� ��� ������ false �� �����Ų��. true �� �Ȱ���. false �� �ٸ���.
 */


 }
}
