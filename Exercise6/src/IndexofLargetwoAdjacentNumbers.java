import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Write a program to read an integer array and find the index of larger number of the two adjacent 
numbers with largest difference. Print the index.	*/		

public class IndexofLargetwoAdjacentNumbers {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] inputArray = new int[n];
		for (int i = 0; i < n; i++) {
			inputArray[i] = Integer.parseInt(br.readLine());
		}
		int largerIndex = 0;
		int largeDifference = 0;
		for (int i = 0; i < inputArray.length-1; i++) {
			int difference = inputArray[i] - inputArray[i + 1];
			if (difference > largeDifference) {
				largeDifference = difference;
				if (inputArray[i] > inputArray[i + 1])
					largerIndex = i;
				else
					largerIndex = i + 1;
			}
		}
		System.out.println(largerIndex);
	}
}
