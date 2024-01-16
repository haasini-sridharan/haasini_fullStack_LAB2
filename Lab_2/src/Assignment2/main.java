package Assignment2;

import java.util.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int denominations= sc.nextInt();
		System.out.println("enter the currency denominations value");
		int currency[]= new int[denominations];
		for(int i=0;i<currency.length;i++)
		{
			currency[i]=sc.nextInt();
		
		}
		
		//Collections.reverseOrder();
		
		System.out.println("enter the amount you want to pay");
		int amount=sc.nextInt();
		InsertionSort ins= new InsertionSort();
		ins.sort(currency);
        System.out.println("After Sorting : "+Arrays.toString(currency));
		NoteCount nc=new NoteCount();
		nc.counting(currency,amount);
		

	}
}


