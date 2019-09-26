
public class SortAndSearch {
	
	//todo: Write a method bubbleSrt which gets an integer array as input and which sorts this array according to the bubblesort algorithm
	//If you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	//Now write another method binSrch. This method again receives an integer array as input together with another integer n.
	//First, it sorts this array by using the bubblSrt method. Then, it searches for n.
	//You can look up the binary search algorithm here: https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search
    public static void main(String[] args) {
    	int[] msg={5,7,3,2,1,10,4,6,9,8};
    	//bubblesort
    	int[] sorted = bubblSrt(msg);
    	for(int k: sorted){
    		System.out.print(k);
   		}
   		System.out.println();
   		//binary search
   		System.out.println(BinSrch(sorted,6));
    }
 
	public static int[] bubblSrt(int[] arr){
		for(int i=0 ; i<arr.length ; i++){
			for(int j=0; j<arr.length-i-1; j++){
		            if(arr[j]>arr[j+1]){
			     	int m=arr[j];
			     	arr[j]=arr[j+1];
			     	arr[j+1]=m;

				}
			}
		}
		return arr;
	} 

	public static int BinSrch(int[] arr,int num){
		int[] m=bubblSrt(arr);
		int min = 0;
		int max = m.length - 1;
		int pivot = m.length / 2;

		while(num != m[pivot] && num<=m[max]){
			if(num<m[pivot]){
				max=pivot-1;
			}else{
				min=pivot+1;
			}
			pivot=(max-min)/2 + min;
    		
    	}
    	return pivot;
	}
}
