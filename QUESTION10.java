import java.util.*;
public class QUESTION10 {
	public static void main(String args[]){
		int x=21,y=36,z=66,ans=1;
		lcm l=new lcm();
		int abc=l.findlcm(x,y,z);
		int arr[]=new int[a];Arrays.fill(arr, 0);
		int num=a;int lcm=abc;
		for(int i=2;i<x&&x>1;i++){
			while((abc%i)==0){
		    arr[i]++;abc/=i;
			}
		}
		for(int i=2;i<num;i++){
			if(arr[i]%2!=0)
				ans*=i;
		}
		System.out.println("The least perfect square number the is divisible by 21,36,66 is: "+ans*lcm);
	}
}
class lcm{
	int gcd(int x, int y)
	{
	    if (y == 0)
	        return x;
	    return gcd(y, x % y);
	}
	int findlcm(int x, int y,int z)
	{
	    int ans = a;
	    ans = ((y * ans) /gcd(y, ans));
	    ans = ((z* ans) /gcd(z, ans));
	    return ans;
	}
	 
}