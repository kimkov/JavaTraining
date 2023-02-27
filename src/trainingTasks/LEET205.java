package trainingTasks;

import java.util.HashMap;
import java.util.Map;

class S205 {
	private String s;
	private String t;
	
	S205(String s, String t) {
		this.s = s;
		this.t = t;
	}
	
	public void setS(String s) {
		this.s = s;
	}
	
	public String getS() {
		return s;
	}
	
	public void setT(String t) {
		this.t = t;
	}
	
	private String transformS(String s) {
		Map<Character, Integer> indexMapping = new HashMap<>();
		StringBuilder build = new StringBuilder();
		
		for(int i = 0; i < s.length(); ++i) {
			char c1 = s.charAt(i);
			
			if(!indexMapping.containsKey(c1)) {
				indexMapping.put(c1, i);
			}
			
			build.append(Integer.toString(indexMapping.get(c1)));
			build.append(" ");
		}
		return build.toString();
	}
	
	public boolean isIsomorphic(String s, String t) {
		return transformS(s).equals(transformS(t));
	}
		
}

public class LEET205 {
	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		
		S205 sl = new S205(s, t);
		
		System.out.println(sl.isIsomorphic(s, t));
	}
}
