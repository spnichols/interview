/*Implement an algorithm to determine if a string has all unique characters. What if you
can not use additional data structures?*/
public class Testing {
	public static void main(String args[]){
		String test = "reddit";
		
		checkUnique(test);
		
		System.out.println(checkUnique(test));
		System.out.println(checkUniqueNoDS(test));
	}
	
	static boolean checkUnique(String input){
		if(input == null)return false;
		int[] asciiArray = new int[256]; 
		
		for(int x = 0; x < input.length(); x++){
			if (asciiArray[(int)input.charAt(x)] == 1) return false;
			asciiArray[(int)input.charAt(x)] = 1;
		}
		
		return true;
	}
	
	static boolean checkUniqueNoDS(String input){
		if(input == null)return false;
		
		for(int x = 0; x < input.length(); x++){
			for(int y = 0; y < input.length(); y++){
				if (x != y){
					if (input.charAt(x) == input.charAt(y)) return false;
				}
			}
		}
		
		return true;
	}
}
