import java.util.Scanner;

// double memory & searching


//1. ���g�@�ӵ{���̷ӥH�U�y�{�i��
// ���ϥΪ̤��_��J����ƪ����J-1����
// ��X�ϥΪ̿�J���Ʀr�����̤j�ȻP�̤p�ȡA�L�X��������m�P��

// 2. ���Ĥ@�D ���ϥΪ̥i�H���3�ӿﶵ�ð�������\��
//    1. ��J�@�ӼƦr �ìd�䦹�ƭȦ��}�C������m �䤣��h���-1
//    2. �N�}�C�����Ʀr�q�p��j�ƦC�æL�X(�L�X���}�C�����Ƿ|���ܬ��ƦC�᪺����)
//    3. ���}�{��

public class day11_day10hw2ans {

	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int num[] = new int[2];
        int count = 0;
        do {
            // ���ϥΪ̤��_��J����ƪ����J-1����
            System.out.print("�п�J�����:");
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            if (n < 0) {
                continue;
            }

            if (count == num.length) {
                int tmpArr[] = new int[num.length * 2];
                for (int j = 0; j < num.length; j++) {
                    tmpArr[j] = num[j];
                }
                num = tmpArr;
            }
            num[count++] = n;
        } while (true);

        // ��X�ϥΪ̿�J���Ʀr�����̤j�ȻP�̤p�ȡA�L�X��������m�P��
        int min, max;
        int minIndex, maxIndex;
        min = max = num[0];
        minIndex = maxIndex = 0;
        for (int i = 1; i < count; i++) {
            if (num[i] > max) {
                maxIndex = i;
                max = num[i];
            }
            if (num[i] < min) {
                minIndex = i;
                min = num[i];
            }
        }
        System.out.println("max: " + max + " maxIndex: " + maxIndex);
        System.out.println("min: " + min + " minIndex: " + minIndex);

        int opt;
        do {
            System.out.print("�п�ܿﶵ1~3:");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    //    1. ��J�@�ӼƦr �ìd�䦹�ƭȦ��}�C������m �䤣��h���-1
                    System.out.print("�п�J�@�ӼƦr�Ӭd���m:");
                    int key = scanner.nextInt();
                    int index = -1;
                    for (int i = 0; i < count; i++) {
                        if (key == num[i]) {
                            index = i;
                            break;
                        }
                    }
                    System.out.println(((index == -1) ? "�䤣��" : (key + " ���� " + index + " �Ӧ�m")));
                    break;
                case 2:
                    //    2. �N�}�C�����Ʀr�q�p��j�ƦC�æL�X(�L�X���}�C�����Ƿ|���ܬ��ƦC�᪺����)
                    for (int i = 1; i < count; i++) {
                        for (int j = 0; j < count - i; j++) {
                            if(num[j] > num[j+1]){
                                int tmp = num[j];
                                num[j] = num[j+1];
                                num[j+1] = tmp;
                            }
                        }
                    }
                    for(int i=0;i<count;i++){
                        System.out.print(num[i] + " ");
                    }
                    System.out.println();
            }
        } while (opt != 3);
}}
		
		
//		
//		do {
//			//��J����
//			int n = scanner.nextInt();
//			if(n==-1)
//				break;
//			if(n<0)
//				continue;
//			
//			//�O���鱱��
//			if (i == n[num.length]) {
//				int temp = new [num. *2];
//				for(int j=0;;) {
//					temp[j] = num[j];
//				}
//				num = temp;
//				
//			}
//			//��̤j�̤p
//			int min, max;
//			int minIndex=-1, maxIndex=-1;
//			min = max = num[0];
//			for(int i=0;;) {
//				if(num[i]>max) {
//					max=num[i];
//					maxIndex=i;			
//				}
//				if(num[i]<min) {
//					min=num[i];
//					minIndex=i;			
//				}
//			}
//			
//			
//			num[i++] = n;
//		}while(true);
//
//		System.out.println();
//		System.out.println();
//		
//		
//		//�ﶵ
//		int opt;
//		do {
//			opt = scanner.nextInt();
//			switch(opt) {
//			case 1: //�d���m
//				
//				int key = scanner
//				int index=-1;
//				for(int i=0;;) {
//					if(key==num[i]) {
//						index[i]=i;
//						break;
//					}
//					
//				}
//				System.out.println();
//			
//			break;
//			}
//			case 2: //�q�p��j�ƦC
//				
//				for(int i=0;;) {
//					for(int j=0;;) {
//						if() {
//							
//						}						
//					}
//				}
//			break;
//			
//		}while(opt!=);
//		
//		
//	}
//}
