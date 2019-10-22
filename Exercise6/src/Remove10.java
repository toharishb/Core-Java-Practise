import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*Write a program to read an integer array and remove all 10s from the array, shift the other 
elements towards left and fill the trailing empty positions by 0 so that the modified array is of 
the same length of the given array.*/


public class Remove10 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] intArray=new int[n];
		for(int i=0;i<n;i++) {
			int j=Integer.parseInt(br.readLine());
			if(j==10)
				j=0;
			intArray[i]=j;
		}
		int count=0;
		for(int i=0;i<intArray.length;i++) 
			if(intArray[i]!=0) 
				intArray[count++]=intArray[i];
			
			while (count <intArray.length) 
				intArray[count++] = 0; 
		
		System.out.println(Arrays.toString(intArray));

	}

}
