import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GradeCalculator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		Map<Integer, Integer> inputsMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) 
		{
			String[] inpts=br.readLine().split(" ");
			inputsMap.put(Integer.parseInt(inpts[0]), Integer.parseInt(inpts[1]));
			
		}
		
		Map<Integer, String> resultMap=calculateGrade(inputsMap);
		
		for(Map.Entry<Integer, String> result:resultMap.entrySet()) {
			System.out.println(result.getKey()+" "+result.getValue());
		}
		
	}
	public static Map<Integer, String> calculateGrade(Map<Integer, Integer> scores){
		
		Map<Integer,String> result=new TreeMap<Integer,String>();
		Set<Integer> inputrollnumbers=scores.keySet();
		
		for(int rollnumber:inputrollnumbers) {
			
			if(scores.get(rollnumber)>100) {
				
			}
			else if(scores.get(rollnumber)>=80)
				result.put(rollnumber, "A");
			else if(scores.get(rollnumber)>=60) 
				result.put(rollnumber, "B");
			else if(scores.get(rollnumber)>=45) 
				result.put(rollnumber, "C");
			else
				result.put(rollnumber, "D");

			
		}
		return result;
		
		
	}

}
