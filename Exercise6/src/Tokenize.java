
public class Tokenize {

	
	/*Tokenize  string
	A  string  S   of  length  L   contains  space-separated  words.  A  group  of  words  in  this  string  is
	enclosed  in  quotes. You  have  to  break  this  string  into  individual  words  without  breaking  the  
	parts  of  the  string  that  are  enclosed  in
	quotes.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="how are you 'man in  bangalore' abc def";
		int j=s.indexOf("'");
		int k=s.lastIndexOf("'");
		String result=s.substring(0, j-1)+s.substring(k+1, s.length());
		System.out.println(result);
		String[] strArray=result.split(" ");
		for(int i=0;i<strArray.length;i++){
		System.out.println(strArray[i]);
		
		}
	}

}
