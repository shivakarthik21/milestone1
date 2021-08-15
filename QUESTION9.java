import java.util.*;
public class QUESTION9 {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the total no of votes : ");
	    int n=sc.nextInt();
	    int othermemvotes = (n*80*45)/(100*100);
	    System.out.print("The number of valid votes for other candidate are : "+othermemvotes);
	}
}
