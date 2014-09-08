
public class CheckingUniqueString {
	public static void main (String args[]){
		System.out.println(removeDup("grape soda captain crunch"));
	}
	
	static String removeDup(String inputString){
		
		if (inputString == null) return inputString;
		String outputString = "";
		boolean currentDuplicate = false;
		for (int x = 0; x < inputString.length(); x++){
			for(int y = 0; y < inputString.length(); y++ ){
				if(x != y){
					if(inputString.charAt(x) == inputString.charAt(y)) currentDuplicate=true;
				}
			}
			if(!currentDuplicate){outputString+=inputString.charAt(x);}
			currentDuplicate=false;
		}
		return outputString;
	}
	
}
