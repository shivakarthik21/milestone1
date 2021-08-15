import java.util.*;
public class QUESTION2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=10,max=0,c=0;
		int arr[]=new int[n];
		System.out.println("Enter 10 elements of array : ");
		for(int index=0;index<n;index++){
			arr[index]=sc.nextInt();
			if(arr[index]>max){
				max=arr[index];c=0;
			}
			if(arr[index]==max)
				c++;
		}
		System.out.print(c);
	}
}
