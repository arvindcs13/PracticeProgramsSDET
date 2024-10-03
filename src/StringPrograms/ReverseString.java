package StringPrograms;

public class ReverseString {
 public static void main(String[] args) {
	   String st="Arvind";
	   String rev="";
	   char ch;
	   for(int i=0;i<st.length();i++) {
		   ch=st.charAt(i);
//		   rev=ch+rev;
		   rev=rev+ch;
	   }
	   System.out.println(rev);
}
}
