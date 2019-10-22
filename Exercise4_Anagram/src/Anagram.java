

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Set;
     
    public class Anagram 
    {
     
    	public static boolean isAnagram(String input1, String input2) 
    	{
     
    		char[] input1Array = input1.toCharArray();
    		char[] input2Array = input2.toCharArray();
    		Arrays.sort(input1Array);
    		Arrays.sort(input2Array);
    		return Arrays.equals(input1Array, input2Array);
    	}
     
    	public static void main(String[] args) throws IOException
    	{
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		String line = br.readLine();
    		int N = Integer.parseInt(line);
    		HashMap<String, Integer> inputsMap = new HashMap<String, Integer>();
    		for (int i = 0; i < N; i++) 
    		{
     
    			if (i == 0)//if no inputs in Map
    				inputsMap.put(br.readLine(), 1);
    			else 
    			{
    				int flag = 0;
    				String inputString = br.readLine();
    				Set<String> setOfInpuStrings = inputsMap.keySet();//Inserting given inputs into Set to loop and validate
    				int noOfWords = setOfInpuStrings.size();
    				for (String string : setOfInpuStrings) 
    				{
    					if (isAnagram(inputString, string))
    					{
    						int prev = inputsMap.get(string);
    						inputsMap.put(string, prev + 1);
    						break;
    					} 
    					else 
    					{
    						flag++;
    					}
    					if (noOfWords == flag)
    						inputsMap.put(inputString, 1);
    				}
     
    			}
     
    		}
     
    		int max = 0;
    		for (Map.Entry<String, Integer> entry : inputsMap.entrySet())
    		{
    			if (entry.getValue() > max)
    				max = entry.getValue();
    		}
     
    		System.out.println(max);
     
    	}
    }
