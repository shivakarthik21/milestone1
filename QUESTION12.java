import java.util.*;
public class QUESTION12 {
	 public static void main(String[] args){
	        int i,m=0,x=0;      
	        int n; 
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the number : ");
	        n=sc.nextInt();
	        m=n/2;      
	        if(n==0||n==1){  
	        	System.out.println(n+" is not prime number");      
	        	}
	        else{  
	        	for(i=2;i<=m;i++){      
	        		if(n%i==0){      
	        			System.out.println(n+" is not prime number");      
	        			x=1;      
	        			break;      
	        			}      
	        		}      
	        	if(x==0){ 
	        		System.out.println(n+" is prime number");
	        		}  
	        	}  
	    }    
}
