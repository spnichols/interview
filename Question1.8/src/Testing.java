
public class Testing {
	public static void main(String args[]){
		System.out.println(CheckSubstring("waterbottle","bottlwater"));
	}
	
	static boolean CheckSubstring(String s1, String s2){
		s1 += s1;
		return s1.contains(s2);
	}
	
}
