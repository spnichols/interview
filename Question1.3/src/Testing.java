/*Design an algorithm and write code to remove the duplicate characters in a string
without using any additional buffer. NOTE: One or two additional variables are fine.
An extra copy of the array is not.
FOLLOW UP
Write the test cases for this method*/


public class Testing {

	public static void main(String args[]){
		
	}
	
	static String removeDup(String input){
		if (input == null) return null;
		String output = input;
		
		for(int x = 0; x < output.length(); x++){
			for(int y = 0; y < output.length(); y++){
				if(x != y){
					if(output.charAt(x) == output.charAt(y)){
						
					}
				}
			}
		}
		
		return input;
	}
}
