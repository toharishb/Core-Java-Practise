import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*## Problem Statement: Repeated  characters
You  are  given  a  string  of  length  N  .  Find  the  most  repeated  character  in  the  string.  
If  many  characters  appear
same  number  of  times  find  the  smallest  one  .

Input  format
First  line  contain  string  S  of  length N.

Output  format
Print  the  most  repeated  letter  in  S.

Input  Constraints
\(1  \le  N  \le  10\)*/
public class RepeatedCharacters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		TreeSet<Character> resultSet=findMaxChar(input);
		 System.out.println(resultSet.first());
	}
	
	private static TreeSet<Character> findMaxChar(String str) {
	    char[] array = str.toCharArray();
	    TreeSet<Character> maxChars = new TreeSet<Character>();

	    int maxCount = 1;
	    maxChars.add(array[0]);

	    for(int i = 0, j = 0; i < str.length() - 1; i = j){
	        int count = 1;
	        while (++j < str.length() && array[i] == array[j]) {
	            count++;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxChars.clear();
	            maxChars.add(array[i]);
	        } else if (count == maxCount) {
	            maxChars.add(array[i]);
	        }
	    }

	    return maxChars;
	}

}
