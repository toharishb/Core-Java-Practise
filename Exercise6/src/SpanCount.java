import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpanCount {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/*System.out.print("Enter input array length");
		int n=Integer.parseInt(br.readLine());
		int[] sampleIntArray=new int[n];*/  
		int[] sampleIntArray= {1,2,3,2,1,2,1,3};

/*		for(int i=0;i<n;i++) {
			System.out.print("Enter "+i+1+"Element");
			sampleIntArray[i]=Integer.parseInt(br.readLine());
		}*/
		//System.out.print("Enter number to find longest sequence");
		int k=Integer.parseInt(br.readLine());
		int maxSpan=0;
		int intermediatecount=0;
		for(int i=0;i<sampleIntArray.length;i++) {
			if(intermediatecount!=0) {
				intermediatecount++;
			}
			if(sampleIntArray[i]==k) {
				if(intermediatecount==0)
						intermediatecount=1;
				maxSpan=intermediatecount;
			}
		}
		System.out.println(maxSpan);
	}
	
}
