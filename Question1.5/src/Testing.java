
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ReplaceSpace("     "));
	}
	
	static String ReplaceSpace(String inputStr){
		String outputStr = "";
		if (inputStr == null) return inputStr
				;
		for(int x = 0; x < inputStr.length();x++){
			if (inputStr.charAt(x) == ' '){outputStr += "%20";}
			else {outputStr += inputStr.charAt(x);}
		}
		return outputStr;
	}

}
