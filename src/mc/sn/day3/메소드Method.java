package mc.sn.day3;

public class �޼ҵ�Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޼ҵ�(method) ���� 
		�޼ҵ�Method pm = new �޼ҵ�Method();
		//pm.viewMonth();
		//int result = pm.add(5,6);
		//System.out.println(result);
		pm.viewMonth(2);
	}
	
	public void viewMonth(int month) {
		int space = 0;
		int lastDay = 0;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			lastDay = 31;
		} else if(month==2) {
			lastDay = 28;
			//����üũ ����
			//1. �⵵�� 400���� ������ �������ų�
			// 2. �⵵�� 4�� ������ �������� 100���� ������ �������� �ʴ� �⵵�̾�� �Ѵ�.
			//(���翬��)/400 �� ((���翬��)/4)/100 �� ���ļ� �Ѵ� true, 28 Ȥ�� 29�� �����½�����.
			//�׷� if(monthday==28) if else(monthday==29)�� ����.
		} else {
			lastDay = 30;
		}
		
		if(month==2||month==3||month==11) {
			//��,��,��,��,��,ȭ,��,��,��,��,��,��
			//1,2,3,4,5,6,7,8,9,10,11,12
			space = 1;
		} else if(month==6) {
			space = 2;
		} else if(month==10||month==12) {
			space = 3;
		} else if(month==4||month==7) {
			space = 4;
		} else if(month==1||month==10) {
			space = 5;
		} else if(month==5) {
			space = 6;
		} else if(month==8) {
			space = 0; //��������, �⺻������ �ʱ�ȭ�Ǿ� ����.
		}
		
		
		System.out.println("2021��"+month+"��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for (int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for (int i=0;i<lastDay;i++) {
			int day = i+1;
				System.out.print(day+"\t");
			if((day+space)%7==0) {
				System.out.println();
				}
			}
		
		}
		public int add(int num1, int num2) { //�Ķ���� ����Ʈ
			int a = num1;
			int b = num2;
			//System.out.println(a+b);
			return a+b;
		}
	}
