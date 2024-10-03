package StringPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class FindingDuplicateInstring {

	public static void main(String[] args) {
		String st="Learn Java Programming";
		String withoutSpace=st.trim().replace(" ", "");
		
		char []chars=withoutSpace.toCharArray();
		
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		
		for(int i=0;i<chars.length;i++) {

			if(hm.containsKey(chars[i])) {
				hm.put(chars[i], hm.get(chars[i])+1);
			}
			else {
				hm.put(chars[i], 1);
			}
		}
//		Using Key Set
		           Set<Character> set=   hm.keySet();
		           
		           for(Character tems : set) {
		        	   if(hm.get(tems)>1) {
		        		   System.out.println(tems+":"+hm.get(tems));
		        	   }
		           }
		           System.out.println("--------------------------------------------------");          
		           
//	Itrating using itrator
	Iterator<Character> it = hm.keySet().iterator();
	while(it.hasNext()) {
		char c=it.next();
		int value= hm.get(c);
	   if(value>1) {
		   System.out.println(c+" :"+value);
	   }
	}
	System.out.println("--------------------------------------------------");
	//With Entry Set 
	       Iterator<Entry<Character, Integer>> entry = hm.entrySet().iterator();
	       while(entry.hasNext()) {
	    	  Entry<Character, Integer> ent = entry.next();
	    	  char c= ent.getKey();
	    	  int values=ent.getValue();
	    	  if(values>1) {
	    		  System.out.println(c+" :"+values);
	    	  }
	       }
	
	}
	

}
