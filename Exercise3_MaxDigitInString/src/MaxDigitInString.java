
public class MaxDigitInString {

	
public static String extractMaximum(String str) {
        int num = 0, res = 0; 
        String result="";
        boolean hasDigit=false;
        for(int i=0;i<str.length();i++) {
        	if(Character.isDigit(str.charAt(i))) {
        		num=num*10+(str.charAt(i)-'0');
        		hasDigit=true;
        	}
        	res=Math.max(res, num);
        	num=0;
        }
        if(hasDigit)
        	result="Max digit : "+res;
        else
        	result="No digits in string";
       
        return result;
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
    	String str="p1 q2 r3";
        System.out.println(extractMaximum(str)); 
    } 

}
