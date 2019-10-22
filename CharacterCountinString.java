package data.structures;

//count the occurrence of a given character in a string

public class CharacterCountinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="harish";
		char ch='h';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch)
				count++;
		}
		System.out.println(count);
	}

}
