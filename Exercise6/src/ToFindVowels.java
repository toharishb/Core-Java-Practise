import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Write a program to read a string and check if given string contains exactly five vowels
in any order. Print Yes if the condition satisfies, else print No.*/

public class ToFindVowels {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		if(str.contains("a")&&str.contains("e")&&str.contains("i")&&str.contains("o")&&str.contains("u"))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
