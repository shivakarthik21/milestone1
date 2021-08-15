import java.util.*;
public class QUESTION15 {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    //let the 2 digits of number be a,b.
	    int num;//let the num be the 2 digit number i.e., num=a*10+b.
	    int revnum;//let the rev_num be the number after interchanging 2 digits of num 
	    //i.e., rev_num=b*10+a.
	    int numdiff=36;//num_diff= num - revnum.
	    //numdiff = (10a+b) - (10b+a) = 9a-9b;
	    int digitdiff = (numdiff) / 9;
	    System.out.print("The difference between digits of the number is : "+digitdiff);
	}
}
