//bbsort

public class day9_sorting {

	public static void main(String[] args) {
		int[] arr= {1,5,6,2};
	
		  for (int i = 0; i < arr.length; i++) {
			  	int temp;
			    // �q�Ĥ@�Ӥ����}�l�A���_�]��� n - 1 - i ��
			    // �쥻�O n - 1�A�|�A�[�W - i �O�]���̫� i �Ӥ����w�g�Ʀn�F
			    // �ҥH�S���n�򨺨ǱƦn���������
			    for (int j = 0; j < arr.length - i -1; j++) {
			      if (arr[j] > arr[j + 1]) {
//			        [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
			      
			    	//swap
			    	  temp = arr[j];
			    	  arr[j]=arr[j+1];
			    	  arr[j+1]=temp;
			    	  
			      }
			    }
			  }
		  for (int i = 0; i < arr.length; i++) {
		  System.out.println(arr[i]);
		  }
	}

}
