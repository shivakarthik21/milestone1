import java.util.*;
public class QUESTION3 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the level of pyramid : ");
		int n=sc.nextInt();
		int pos=1,space=n-1,num=1;
		while(pos<=n){
			for(int index=1;index<=space;index++)
				System.out.print(" ");
			for(int index=1;index<=pos;index++){
				if(num>9){
					num=num%9-1;
				}
				System.out.print(num);num++;
			}
			int rev=num-2;
			for(int index=1;index<pos;index++){
				if(rev<0){
					rev=9;
				}
				System.out.print(rev);
				rev--;
			}
			pos++;
			System.out.print("\n");
			space--;
		}
	}
}
