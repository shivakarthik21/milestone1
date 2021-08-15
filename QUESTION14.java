import java.util.*;
import java.lang.Math;
public class QUESTION14 {
	public static void main(String[] args) 
	   {
	      Scanner sc = new Scanner(System.in);
	      int a=43,b=91,c=183;
	    
	      int p=Math.abs(a-b);
	      int q=Math.abs(c-b);
	      int w=Math.abs(c-a);
	      int gcdNumbers = QUESTION14.findGCD(p, q, w);
	      System.out.println(gcdNumbers);
	      sc.close();
	   }
	   public static int findGCD(int a, int b) 
	   {
	      if(b == 0)
	      {
	         return a;
	      }
	      else
	      {
	         return findGCD(b, a % b);
	      }
	   }
	   public static int findGCD(int a, int b, int c) 
	   {
	      return findGCD(findGCD(a, b), c);
	   }
}
