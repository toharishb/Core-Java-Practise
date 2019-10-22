import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LuckyRegistrationNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=checkRegistrationNumber("KA01MG1133");
		if(result==1)
			System.out.println("Lucky registration number");
		else if(result==0)
			System.out.println("Valid registration number");
		else 
			System.out.println("Invalid registration number");

	}
	
	public static int checkRegistrationNumber(String registrationNumber) {
		
			Matcher m = Pattern.compile("([KA]|[DL])([0-9]{2})([A-Z]{1,2})[1-9][0-9][0-9][0-9]").matcher(registrationNumber);
			if(m.find()) {
				int number=Integer.parseInt(registrationNumber.substring(registrationNumber.length()-4, registrationNumber.length()));
				while (number > 10) {
					number=sum(number);
				}
				if(number%2==0)
					return 1;
				else
					return 0;
			}
			else
				return -1;
				
	}
	
	public static int sum(int number) {
		int sum=0;
		while (number > 0) {
			int n = number % 10;
			sum = sum + n;
			number = number / 10;
		}
		return sum;
	}

}
