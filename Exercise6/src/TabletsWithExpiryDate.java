import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*### Files
- A text file contains tablet name and expiry date separated by comma in each line. Read all the tablet names and create a 
  Map with key as Tablet name and value as expiry date. The Map should contain tablets which are already expired?
*/
public class TabletsWithExpiryDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/mm/yyyy");
		try(Stream<String> dataRepo = Files.lines(Paths.get("src","Tablet.txt"))){
			//to convert Stream of String to a list
			List<String[]> tabletList = dataRepo.map(data-> data.split(",")).collect(Collectors.toCollection(ArrayList::new));
			Map<String, Date> finalMap=new HashMap<>();
			for(String[] strArray:tabletList) {
				Date dt=format1.parse(strArray[1]);
				if(!dt.before(Calendar.getInstance().getTime()))
					finalMap.put(strArray[0], dt);
			}
			 
			for(String key:finalMap.keySet()) {
				System.out.println(finalMap.get(key));
			}
			
		}
		catch (IOException e) {
		e.printStackTrace();
		}
	}
}
