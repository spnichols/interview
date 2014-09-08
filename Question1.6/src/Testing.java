
public class Testing {
	public static void main(String args[]){
		int[][] testingArray = new int[][]{{1,2,3,4},{5,6,7,8}, {9,10,11,12}};
		
		RotateArray(testingArray);
		
		for(int x = 0; x < testingArray.length;x++){
			for(int y = 0; y < testingArray[x].length;y++){
				System.out.print(testingArray[x][y] + " ");
			}
			System.out.println("");
		}
	}
	
	static int[][] RotateArray(int[][] inputArray){
		int size = inputArray.length ^ 2;
		int temp;
		
		
		return inputArray;
	}
}
