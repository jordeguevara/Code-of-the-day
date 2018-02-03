public class w1Friday{


  public static void main(String [] args){
      /**
         * 
         * Make a method that accepts a string 
         * that consists of multiple of words and 
         * only abbreviates the words that have a 
         * length of 4 or greater.
         * 
         * 
         * But if the string has only one word of length 3 or less
         * just return the string.
         * 
         * example:
         * 
         * "Hello World and to the mass universe"
        //    5     5    3   2  3    4     8     // note that words of length
        *                                        // 3 or less are not abbreviated
         * 
         * output: 
         * 
         *  "H3o W3d and to the m2s u6e"
         * 
        
        */
  
  
  }
  public static String AlvaroMethod(String str){
    
    
    
  }
  private static StringBuilder abriviate(String c) {//Rushabh's Method
		// TODO Auto-generated method stub
		String[] array=c.split(" ");
		StringBuilder newer=new StringBuilder();
		for(int i=0;i<array.length;i++) {
			if(array[i].length()<=3) {
				newer.append(array[i]+" ");
				
			}else {
				
				int j=array[i].length()-2;
				char c1=array[i].charAt(0);
				char d=array[i].charAt(array[i].length()-1);
				newer.append(c1+Integer.toString(j)+d+" ");
				
			}
		}
		return newer;
	}
	
public static String regExpMethod(String str){ // Jorde's Method
    String[] words = str.split(" ");
    String temp="";
    
    for(int i =0; i < words.length;i++) { 
        int n = words[i].length();
       temp += (words[i].length() >3) ? (words[i].substring(0, 1) + (n-2) + words[i].charAt(n-1) + " ")
                : words[i]+" ";
    }
    return temp;
  }

}
