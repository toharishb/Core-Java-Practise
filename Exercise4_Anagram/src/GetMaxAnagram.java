import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GetMaxAnagram {
	
	public static boolean isanagram(String s1,String s2) {
		
		char[] charArray1=s1.toCharArray();
		char[] charArray2=s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
			return Arrays.equals(charArray1,charArray2);

		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		HashMap<String, Integer> inpuMap=new HashMap<>();
		for(int i=0;i<N;i++) {
			if(i==0)
				inpuMap.put(br.readLine(),1);
			else {
				int flag=0;
				Set<String> set=inpuMap.keySet();
				String str=br.readLine();
				int noOfWords = set.size();
				for(String inputString:set) {
					if(isanagram(inputString, str)) {
						int prev=inpuMap.get(str);
						inpuMap.put(inputString, prev+1);
						break;
					}
					else {
						flag++;
					}
					if(noOfWords==flag) {
						inpuMap.put(inputString, flag);
					}
				}
				
				
			}
				
		}
		int max = 0;
		for (Map.Entry<String, Integer> entry : inpuMap.entrySet())
		{
			if (entry.getValue() > max)
				max = entry.getValue();
		}
 
		System.out.println(max);
		
	}

}
