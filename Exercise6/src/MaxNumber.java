import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MaxNumber {
	/*Given  an  array  of  numbers,  arrange  them  in  a  way  that  yields  the  largest  value.  For  example,  if  the  given
	numbers  are  {54,  546,  548,  60},  the  arrangement  6054854654  gives  the  largest  value.
	input:
	First  line  contains  an  integer  N   ,  Next  line  contains  N   integers  separated  by  space.
	output:
	Print  the  maximum  number  that  can  be  obtained  by  using  given  numbers.
	Constraints:
	1<=N<=1000
	1<=Number<=1000000*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String[] input=new String[N];
		for(int i=0;i<N;i++){
			input[i]=br.readLine();
		}
		
		List<String> inputList=Arrays.asList(input);
		inputList.sort((s1,s2)->(s1+s2).compareTo(s2+s1)>0?-1:1);
		inputList.forEach(System.out::print);
	}
	
	
}
