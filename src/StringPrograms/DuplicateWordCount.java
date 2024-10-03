package StringPrograms;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateWordCount {
	public static void main(String[] args) {
                 String st ="Test Automation Test Java Selenium Java";
                 String []st1=st.split(" ");
                 
                 HashMap<String,Integer> hm= new HashMap<String,Integer>();
//                 int count=0;
                 for(String word:st1) {
                	 if(hm.containsKey(word)) {
                		 hm.put(word, hm.get(word)+1);
                	 }
                	 else {
                		 hm.put(word, 1);
                	 }
                 }
                 
                 System.out.println(hm);
                 
                Iterator<String> it = hm.keySet().iterator();
                while(it.hasNext()) {
                	String st2=it.next();
                	int count= hm.get(st2);
                	if(count>1) {
                		System.out.println(st2+" :"+count);
                	}
                }
                 
	}
}
