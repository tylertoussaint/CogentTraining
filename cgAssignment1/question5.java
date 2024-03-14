package cgAssignment1;
import java.util.Arrays;
public class question5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String arr[]= {"dog","cat","bird","dinosaur","alpaca"};
	String result[]= new String [5];
	int index=0;
	for(String animal:arr) {
		int end=animal.length()-1;
		String nString="";
		while (end>=0){
			nString+=animal.charAt(end);
			end-=1;
		}
		result[index]=nString;
		index+=1;
	}
	for(String results:result) {
		System.out.println(results);
	}
	Arrays.sort(result);
	System.out.println(Arrays.toString(result));
}
}
