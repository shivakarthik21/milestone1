import java.util.*;
public class QUESTION8 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int trainlen,manspeed,time;
		System.out.print("Enter the train length : ");
		trainlen = sc.nextInt();
		System.out.print("Enter the man speed in km/hr : ");
		man_speed = sc.nextInt();
		System.out.print("Enter the time in seconds : ");
		time = sc.nextInt();
		int relativetrainspeed = ((trainlen*18)/(time*5));
		int trainspeed = relativetrainspeed + manspeed;
		System.out.print("The speed of train in km/hr is : "+trainspeed);
	}
}
