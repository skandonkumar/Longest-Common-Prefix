
public class LongestCommonPrefix {
	 public String longestCommonPrefix(String[] strs) {
		 String res="";
		 if(strs.length == 0) {
			 return res;
		 }
		 String[] chararray = strs[0].split("");
		 
		 if(chararray[0].equals("")) {
			 return res;
		 }
		 
		 int a=0;
		do {			
			 char comp = strs[0].charAt(a);
			 for(int j=1;j<strs.length;j++) {
				 try {
					 if(strs[j].charAt(a) != comp) {
						 return res;
					 }
				 }catch(Exception e) {
					 return res;
				 }
			 }
			 res+=comp;
			 if(chararray.length!=1)
				 a++;
			 else {
				 break;
			 }			 
		 }while(a < chararray.length);
		 return res;
	 }
	 public static void main(String args[]) {
		 String[] strs = {"flower", "flow", "float"};
		 LongestCommonPrefix obj = new LongestCommonPrefix();
		 System.out.println(obj.longestCommonPrefix(strs));
	 }
}
