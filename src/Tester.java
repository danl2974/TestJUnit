import java.util.ArrayList;
import org.junit.Test;


public class Tester {
	

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
	   
	   ArrayList<Integer> plist = Tester.doPerfectFinder(5, 9000);
	   
	   int x;
	   for (x=0;x < plist.size() ;x++){
		   
		   System.out.println( String.valueOf(plist.get(x)) );
	   }
	
	}

	
	public static ArrayList<Integer> doPerfectFinder(int from, int to){
		
		int i;
		
		
		ArrayList<Integer> perfect = new ArrayList<Integer>();
		
		for(i = from; i <= to; i++){
			int sum = 0;
			int y;
			for(y=1; y < i; y++){
				
				if((i % y) == 0){
					sum += y;
				}
				
			}
			if (sum == i){
				perfect.add(sum);
			
			}
			
		 }
		
		
		return perfect;
		
		
	  }
		
	}
	
	

