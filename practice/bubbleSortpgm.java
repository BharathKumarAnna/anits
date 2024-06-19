package practice;

public class bubbleSortpgm {	
	
	public static void main(String[] args) {
		int[] arr = {5,6,9,7,4,2,8};
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//swapping
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		for(int i : arr) {
			System.out.println(i);
		}
		
	}

}


