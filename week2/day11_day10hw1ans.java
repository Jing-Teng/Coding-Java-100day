// double memory student'grade scores



        
// 3. ���g�@�ӵ{���̷ӥH�U�y�{�i��
// ���ϥΪ̥i�H��J�h�����Z��ơA���Z��ƥ]�t ���/�^��A�ñN�y���B���B�^��B�`���x�s�i�}�C��
// ��J�L�{���p�G��J-1�h�����J �p�G�w�g��J��妨�Z �h�����j����J�^�妨�Z(�����)
// ���ϥΪ̥i�H��ܥH�U�ﶵ�ð�������\��
//    1. �̷��`���ƦW �P���h��ܦP�W
//    2. �̷Ӯy���Ƨ� ������ܦW��
//    3. ���}�{��

public class day11_day10hw1ans {

	public static void main(String[] args) {
		int student[][] = new int[2][];
        int count = 0;
        
        do {
            System.out.print("�п�J��妨�Z(-1�h�����J):");
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            if (count == student.length) {
                int[][] tmpArr = new int[student.length * 2][];
                for (int i = 0; i < student.length; i++) {
                    tmpArr[i] = student[i];
                }
                student = tmpArr;
            }
            student[count] = new int[4];
            student[count][0] = count + 1;
            student[count][1] = n;
            System.out.print("�п�J�^�妨�Z:");
            n = scanner.nextInt();
            student[count][2] = n;
            student[count][3] = student[count][1] + student[count][2];
            count++;

        } while (true);

        int opt;
        do {
            System.out.print("�п�J�ﶵ 1~3:");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    for (int i = 1; i < count; i++) {
                        for (int j = 0; j < count - i; j++) {
                            if (student[j][3] < student[j + 1][3]) {
                                int tmp[] = student[j];
                                student[j] = student[j + 1];
                                student[j + 1] = tmp;
                            }
                        }
                    }
                    int tmpSum = -1;
                    int tmpRank = -1;
                    for (int i = 0; i < count; i++) {
                        System.out.print("�y��: " + student[i][0]);
                        System.out.print(" ���: " + student[i][1]);
                        System.out.print(" �^��: " + student[i][2]);
                        System.out.print(" �`��: " + student[i][3]);
                        if (tmpSum != student[i][3]) {
                            tmpRank = i + 1;
                            tmpSum = student[i][3];
                        }
                        System.out.println(" �W��: " + tmpRank);
                    }
                    break;
                case 2:
                    for (int i = 1; i < count; i++) {
                        for (int j = 0; j < count - i; j++) {
                            if (student[j][0] > student[j + 1][0]) {
                                int tmp[] = student[j];
                                student[j] = student[j + 1];
                                student[j + 1] = tmp;
                            }
                        }
                    }
                    for (int i = 0; i < count; i++) {
                        System.out.print("�y��: " + student[i][0]);
                        System.out.print(" ���: " + student[i][1]);
                        System.out.print(" �^��: " + student[i][2]);
                        System.out.println(" �`��: " + student[i][3]);
                    }
                    break;
            }
        } while (opt != 3);
		
		
//		int student[][] = ;
//				
//
//		do {
//			//��J����
//			System.out.println();
//			int n = scanner
//					
//			
//			if (n==-1)
//				break;
//			
//			
//			//�O���鱱��
//			if(c==length) {
//				
//				
//			}
//			
//			//�x�s
//			student[c]=new [4]	
//			student[c][0] = c+1;//�y��
//			student[c][1] = n;//���Z1
//			n = scanner	//��J2
//			student[c][2]=n//�x�s���Z2
//			student[c][3]=[1]+[2]; //�`��
//			c++;
//				
//			}
//		}while();
//		
//		
//		//���
//		do { //��汱��c
//			opt = ;
//			switch(opt){
//			case 1: 
//				//rank sorting 
//				
//				//searching & give a rank &print
//				
//				
//				
//			break;
//			
//			case 2:
//			break;
//			
//			
//			}
//
//		}while();
		
	}

}
