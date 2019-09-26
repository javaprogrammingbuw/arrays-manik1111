//Bonus 2D Arrays
public class MagicSquare {
	/*
	 * Todo: A magic square is a quadratic matrix where the sums of each row and
	 * each column are equal. All possible numbers from 1 to (side length)^2 have to occur
	 * in the square. Write a method that takes a 2D Array as input and checks if it is a magic
	 * square or not.
	 * */
	public static void main(String[] args) {
		int[][] array={{2,7,6},{9,5,1},{4,3,8}};
		System.out.println(magicSquare(array));
		
	
	}

	public static boolean magicSquare(int[][] arr){
		int sum = 0;
		int temp = 0;
		int diagonal = 0;
		//is it a square?
		for(int i=0; i<arr.length; i++){
			if(arr.length!=arr[i].length){
	          return false;
			}
		}

		//initialization of actual (temp) and desired (sum) values
		for(int i = 0; i<arr[0].length; i++){
			sum += arr[0][i];
			temp += arr[0][i];
		}

		//do all rows have the same sum?
		for (int i=1; i<arr.length ; i++){
			if(temp!=sum){
				return false;
			}
			else{
				temp = 0;
			}
			for(int j=0 ; j<arr[i].length ; j++){
				temp =temp + arr[i][j];
			}
		}

		//do all columns have the same sum?
		for (int i=0; i<arr.length ; i++){
			if(temp!=sum){
				return false;
			}
			else{
				temp = 0;
			}
			for(int j=0 ; j<arr[i].length ; j++){
				temp =temp + arr[j][i];
			}
		}

		// comparing the diagonal total with sum
		
		temp = 0;
		for(int i=0 ; i<arr.length ; i++){


			temp=temp + arr[i][i];
			diagonal = diagonal + arr[i][arr.length-1-i];
		}
		if (temp != sum || diagonal != sum){
			return false;
		}return true;

 	}   

}

