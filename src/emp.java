
import java.util.HashMap;
import java.util.Map;

public class emp {
public static void main(String[] args) {
	
	
	implementation emp2 = new implementation(102);
	implementation emp3 = new implementation(102);
	
	implementation emp4 = new implementation("Byron");
	implementation emp5 = new implementation("Conard");
	
	
	Map<implementation,implementation> empMap=new HashMap<implementation,implementation>();

	//Map<Integer,String> empMap2=new HashMap<Integer,String>();
	
	empMap.put(emp2,emp4);
	empMap.put(emp3,emp5);
	
	
	System.out.println(empMap.entrySet());
	System.out.println(empMap.get(emp2));
	System.out.println(empMap.get(emp3));
	
	
	
	
}
}