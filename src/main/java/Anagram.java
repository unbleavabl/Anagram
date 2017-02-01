import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class Anagram {
	String word;

	public Anagram(String str){
		word=str;
	}
	
	public static Map<Character,Integer> getNewMap(String str){
		Map<Character,Integer> newMap = new HashMap<Character,Integer>();

		for(int i=0;i<str.length();i++){
			Integer value = newMap.get(str.charAt(i));
			if(value == null){
				newMap.put(str.charAt(i),1);
			}
			else{
				newMap.put(str.charAt(i),value+1);
			}
		}
		return newMap;
	}

	public List<String> match (List<String> inp){
		Map<Character,Integer> wordMap = getNewMap(word.toLowerCase());
		List<String> anag = new ArrayList<String>();
		
		for(String temp:inp){
			Map<Character,Integer> tempMap = getNewMap(temp.toLowerCase());
			if(wordMap.equals(tempMap)){
				if((word.toLowerCase()).equals(temp.toLowerCase())){
					continue;
				}
				anag.add(temp);
			}
		}
		return anag;
	}

}
