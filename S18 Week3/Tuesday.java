public class{
  
  public static void main(String [] args){
  
          
//        Complete the function caffeineBuzz, which takes a non-zero integer as it's one argument.
//
//If the integer is divisible by 3, return the string "Java".
//
//If the integer is divisible by 3 and divisible by 4, return the string "Coffee"
//
//If the integer is one of the above and is even, add "Script" to the end of the string.
//
//Otherwise, return the string "mocha_missing!"
  
  }


}
 public static String caffineBuzz (int n) { //Rushabh's Method
		String msg = "";
		if(n%3==0 ) {
			if(n%2==0) {
			msg="Java Script";
			}else if(n%4==0 && n%2==0) {
				msg="coffee Script";
			}else if(n%4==0) {
				msg="coffee";
			}
			else if(n%3==0) {
				msg="Java";
			}

		}
		return msg;
	}
	
public static String numberMethod(int n) // Daniel's Method
    {
        String temp = "";
        
        if((n%3) == 0)
        {
            if((n%4) == 0)
            {
                temp += "Coffee ";
            }
            else
            {
                temp += "Java ";
            }
        }
        
        if(!(temp.isEmpty()))
        {
            return temp + "Script ";
        }
        
            return "mocha_missing";
    }



	public static String caffineBuzz (int n) { //Eddy's method
		String msg = "";
		
		if (n % 3 == 0 && n % 4 == 0) {
			msg = "Coffeescript";
		}
		
		else if (n % 3 == 0) {
			msg =  "Java";
			if (n%2 == 0) {
				msg += "script";
			}
		}
		
		else {
			return "mocha_missing!";
		}
		
		return msg;
  }
    static String work(int x) { //juancarlos olivares
		if (x % 3 == 0 && x % 4 == 0) {
			if (x % 2 == 0) {
				return "Coffee Script";
			}
			return "Coffee";
		}
		if (x % 3 == 0) {
			if (x % 2 == 0) {
				return "Coffee Script";
			}
			return "Java";
		}
		return "mocha_missing!";

	}
//Ariel's Method
if(num / 3){
	System.out.println("Java");
}
else if((num /3))&&((num /4){
	System.out.println("Coffee");
	if(num%12 == 0){
	System.out.print("Coffee Script");
	}
}
	}
		    
  public static String caffeineBuzz(int num) { //Jorde's Method
      String temp="";
     if(num >=0){ 
      if(num%3 ==0)
          temp+= "java";
          if(num%4==0)
              temp = "coffee";
              if(num%2==0)
                  temp+="script";
      else
          temp =  "mocha_missing!";
     }
     else {
         temp = "NonZero/NonNumber: Try again";
     }
      return temp;
  }
