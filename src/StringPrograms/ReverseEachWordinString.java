package StringPrograms;

public class ReverseEachWordinString {
public static void main(String[] args) {
	
	String st="Arvind is an boy";
	String []arr=st.split(" ");
	String word_rev="";
	
	String []rev_arr= new String[arr.length];
	String reverse_String="";
	
	for(int i=0;i<arr.length;i++) {
		
		for(int j=0;j<arr[i].length();j++) {
			char ch=arr[i].charAt(j);
			word_rev=ch+word_rev;
			
		}
//		System.out.println(word_rev);
//		rev_arr[i]=word_rev+" ";
		reverse_String=reverse_String+word_rev+" ";
		word_rev="";
		
		
		
	}
System.out.println(reverse_String);
	
}
}
