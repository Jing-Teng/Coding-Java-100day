//bbsort

public class day9_sorting {

	public static void main(String[] args) {
		int[] arr= {1,5,6,2};
	
		  for (int i = 0; i < arr.length; i++) {
			  	int temp;
			    // 從第一個元素開始，不斷跑到第 n - 1 - i 個
			    // 原本是 n - 1，會再加上 - i 是因為最後 i 個元素已經排好了
			    // 所以沒必要跟那些排好的元素比較
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
