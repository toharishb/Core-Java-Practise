package data.structures;

public class NumberofVowelsandconsonantsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hi how are you";
		str=str.toLowerCase();
		int vowelCount=0,consonantCount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
				vowelCount=vowelCount+1;
			else if(ch>='a'&&ch<='z') {
				consonantCount=consonantCount+1;
			}
		}
		System.out.println("VowelCount   "+vowelCount);
		System.out.println("ConsonantCount   "+consonantCount);

	}

}
