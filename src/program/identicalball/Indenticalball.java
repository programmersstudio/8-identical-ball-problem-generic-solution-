package program.identicalball;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Indenticalball {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Total number of balls..?");
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Please enter the weight");
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}

		getTheBall(arr);
	}
	
	public static void getTheBall(int[] arr) {
		
//		int remainder = arr.length % 3;
		
//		int quotent = arr.length / 3;
			
		int[] anotherArray = new int[arr.length];
		
		System.arraycopy(arr, 0, anotherArray, 0, arr.length);
		
		Arrays.sort(anotherArray);
		
		int value = 0;
		int location = 0;
		
		if(anotherArray[0] != anotherArray[1] && anotherArray[0] != anotherArray[2]) {
			value = anotherArray[0];
			location = anotherArray[0];
		}
		
		if(anotherArray[anotherArray.length-1] != anotherArray[anotherArray.length-2] && anotherArray[anotherArray.length-1] != anotherArray[anotherArray.length-3]) {
			value = anotherArray[anotherArray.length-1];
			location = anotherArray[anotherArray.length-1];
		}
		
//		Integer[] arrForList = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
		List<Integer> arrList  = Arrays.stream( arr ).boxed().collect( Collectors.toList() );
		
//		Arrays.asList(arrForList);
		
		int finalLocation = arrList.indexOf(location) + 1;
		
		System.out.println(value + "\n" + finalLocation);
	}

}
