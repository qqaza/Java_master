package Chapter4;

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		//1~ 50
		
		// 3,6,9 ���� üũ ����
		//���� = 1~50 �ݺ���
			//1�� �ڸ��� 3,6,9 ���� üũ
		
			//10�� �ڸ� 3,6,9 ���� üũ
		
		
		for(int i = 1; i<=50; i++) {
			int a = i%10;
			int aa = i/10;
			
			if(a == 3 && aa == 3 || a == 6 && aa == 3 || a==9 && aa==3) {
				System.out.print("����");
			}else if(a == 3 || a == 6|| a == 9) {
				System.out.print("��");
			}else if(aa == 3 || aa == 6 || aa == 9) {
				System.out.print("��");
			}else {
				System.out.print(i);
			}
			if(a == 0) {
				System.out.println();
			}
				System.out.print(" ");
				
		}
			//3,6,9 ���� üũ ����
			int cnt = 0;
			//���� 1~50 �ݺ���
			for(int i=1; i<=50; i++) {
				cnt = 0;
				if(i%10 == 3 || i%10 == 6 || i%10 == 9)cnt++;//�����ڸ��� 3,6,9 ����üũ
				if(i/10 == 3 || i/10 == 6 || i/10 == 9)cnt++;//�����ڸ��� 3,6,9 ����üũ				//��
				//������ 0���̸� ���� ���
				//������ 1���̸� �� 
				//������ 2���̸� ���� 
				switch(cnt) {
				case 0 : System.out.print(i + "\t");break;
				case 1 : System.out.print("��\t");break;
				case 2 : System.out.print("����\t");
				}
				if(i%10 == 0) System.out.println(); //���ٿ� 10���� ���
			}
		
			//���� ��ȯ ���α׷�
//			
//			Scanner sc = new Scanner(System.in);
//			int result = 0;
//			int[] coin = new int[5];
//			
//			System.out.print("##��ȯ�� �ݾ� : ");
//			int total = sc.nextInt();
//			while(true) {
//				if(total >500) {
//					coin[0] = total/500;
//					total -= coin[0]*500;
//					result += 500*coin[0];
//				}else if(total >100) {
//					coin[1] = total/100;
//					total -= coin[1]*100;
//					result += 100*coin[1];
//				}else if(total >50) {
//					coin[2] = total/50;
//					total -= coin[2]*50;
//					result += 50*coin[2];
//				}else if(total >10) {
//					coin[3] = total/10;
//					total -= coin[3]*10;
//					result += 10*coin[3];
//				}else {
//					break;
//				}
//			}
//			System.out.println("500�� ¥�� : " + coin[0]+ "��");
//			System.out.println("100�� ¥�� : " + coin[1]+ "��");
//			System.out.println("50�� ¥�� : " + coin[2]+ "��");
//			System.out.println("10�� ¥�� : " + coin[3]+ "��");
//			System.out.println("��ȯ �ݾ� : " + result + "��");
//			System.out.println("���� �ݾ� : " + total + "��");
			////////////////////////////////////////////////////////
			Scanner sc = new Scanner(System.in);
			System.out.print("##��ȯ�� �ݾ� : ");
			int money = sc.nextInt();
			System.out.println("500�� ¥�� : " + money/500 + "��");
			int remoney = money%500;
			System.out.println("100�� ¥�� : " + remoney/100 + "��");
			remoney %= 100;
			System.out.println("50�� ¥�� : " + remoney/50 + "��");
			remoney %= 50;
			System.out.println("100�� ¥�� : " + remoney/10 + "��");
			remoney %= 10;
			System.out.println("��ȯ �ݾ� :" + (money - remoney));
			System.out.println("���� �ݾ� : " + remoney);
			
			
			//���� ���߱� 1~100 ������ ��
			// com ���� �߻� Math.random()
			int num = (int)(Math.random()*100)+1;
			//�ݺ��� ����
			while(true) {
				System.out.println("���� �Է� : ");
				int num2 = sc.nextInt();
				if(num == num2 ) {
					System.out.println("���� �մϴ�");
					break;
				}else if(num < num2) {
					System.out.println("down �ϼ���");
					
				}else {
					System.out.println("up �ϼ���");
				}
				
			}
				//���� �Է� ����
				//�Է� ���� == ä��  -> �����մϴ� �ݺ��� Ż��
				//�Է¼��� > com -> down �ϼ���
				// �Է¼��� < com -> up �ϼ���
			
			
			
			
			
			
	}	//end main

}//end class
