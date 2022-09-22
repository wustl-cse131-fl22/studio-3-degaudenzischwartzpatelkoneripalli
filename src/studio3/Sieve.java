package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("N: ");
		int n = in.nextInt();
		int[] array = new int[n];
		boolean[] mark= new boolean[n];
		//making the array
		for(int i=0; i<n; i++)
		{
			array[i]=i;
			mark[i]=true;
			
		}
		
		for(int p=2; p<Math.sqrt(array.length);p++)
		{
			if(mark[p-1]==true)
			{
				for(int j=p*p; j<n;j+=p)
				{
					mark[j]=false;
				}
			}
		}
		
		for(int q=0; q<array.length;q++)
		{
			System.out.println(array[q]);
			System.out.println(mark[q]);
		}
		
		
		
		
	}

}
