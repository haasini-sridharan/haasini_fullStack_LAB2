package Assignment1;

import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int days=sc.nextInt();
		int revenue[]=new int[days];
		System.out.println("enter the values of array");
		for(int i=0;i<days;i++)
		{
			revenue[i]=sc.nextInt();
		}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		int targets=sc.nextInt();
		for(int i=0;i<targets;i++) {
			System.out.println("enter the value of target");
			int value=sc.nextInt();
			targetEval(value,revenue);
			
		}

	}
	public static void targetEval(int value, int[] revenue) {	
		
		
		int sum=0,j;
		for(j=0;j<revenue.length;j++)
		{sum+=revenue[j];
		if(sum>=value)

			{System.out.println("Target achieved after "+(j+1)+" transaction");
			break;
			}
		}

		if(j>=revenue.length)
		System.out.println("Given target is not achieve");	
		
	}

}
