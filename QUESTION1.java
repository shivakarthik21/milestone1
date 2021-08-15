import java.util.*;
public class QUESTION1 {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    int index,n=25;
	    int Array[] = new int[n];
	    System.out.println("Enter 25 elements of array : ");
		for(index=0;index<n;index++){
			Array[index]=sc.nextInt();	
		}
	    int max = Array[0];
	    for (index = 1; index < n; index++){
	        if (Array[index] > max)
	            max = Array[index];
	       }
	    System.out.println(max);
	}
}

