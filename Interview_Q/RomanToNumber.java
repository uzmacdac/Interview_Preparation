
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class RomanConversionToNumber
{
	
	static void convert(String str )
	{
		Map<Character, Integer> map=new HashMap<Character, Integer>();  
		map.put('I',1);  
        map.put('V',5);  
        map.put('X',10);  
        map.put('L',50);  
        map.put('C',100);  
        map.put('D',500);  
        map.put('M',1000);  
		
		
		
	}
	
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roman number");
		String str = sc.next().toUpperCase();
		
			
	}

}