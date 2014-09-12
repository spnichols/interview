
public class Testing {
	
	public static void main(String args[]){
		int[][] testingArray = new int[][]{{1,2,3,4},{5,6,0,8}, {9,10,11,12}};
		
		ExtendZero(testingArray);
		
		for(int x = 0; x < testingArray.length;x++){
			for(int y = 0; y < testingArray[x].length;y++){
				System.out.print(testingArray[x][y] + " ");
			}
			System.out.println("");
			System.out.println("hahaha");
		}
	}
	
	static int[][] ExtendZero(int[][] inputArray){
		
		for(int x = 0; x < inputArray.length;x++){
			for(int y = 0; y < inputArray[x].length;y++){
				if (inputArray[x][y] == 0){
					for (int i =0; i < inputArray.length;i++){
						inputArray[i][y] = 0;
					}
					for (int k =0; k < inputArray[x].length;k++){
						inputArray[x][k] = 0;
					}
					return inputArray;
				}
			}
		}
		return inputArray;
	}
	
}
