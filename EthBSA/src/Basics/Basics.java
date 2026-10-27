package Basics;

import java.util.Arrays;
import java.util.Scanner;


public class Basics {

	public static void main(String[] args) {
		//		Number a=10;
		//		Number b=20;
		//	System.out.println(a+b);

		//		int a=10;
		//		int b=20;
		//		System.out.println(a<b);
		//		String a="Rahul";
		//		//		a="Mallikarjun";
		//
		//		//		System.out.println(a);
		//		Scanner sc=new Scanner(System.in);

		//		int [][]arr=new int[3][3];
		//
		//		for(int i=0; i<arr.length;i++)
		//		{
		//			System.out.println("Enter the values for"+arr[i]+"");
		//			for(int j=0; j<arr[i].length;j++) 
		//			{
		//				arr[i][j]=sc.nextInt();
		//			}
		//		}
		//		
		//		System.out.println(arr);
		//		System.out.println(Arrays.toString(arr));
		//		System.out.println(Arrays.deepToString(arr));
		//	}

		//		int []arr=new int[]{1,2,3,4,5};	
		//		int s=0;
		//		int e=arr.length-1;



		//		while(s<e)
		//		{
		//			int temp=arr[s];
		//			 arr[s]=arr[e];
		//			 arr[e]=temp;
		//			 s++;
		//			e--;
		//		}
		//			System.out.println(Arrays.toString(arr));
		//		}
		//	do
		//	{
		//		int temp=arr[s];
		//		 arr[s]=arr[e];
		//		 arr[e]=temp;
		//		 s++;
		//		e--;
		//	}while(s<e);
		//	
		//	
		//		System.out.println(Arrays.toString(arr));
		//	}
		//		add();
		//
		//	}
		//	public static void add()
		//	{
		//		System.out.println(10+20);
		//
		//	}
		//}

		//		int []arr=new int[]{1,2,3,4,5,6,7,8,};	
		//		int o=0;
		//		int e=arr.length-1;
		//
		//		for(int i=0; i<arr.length;i++)
		//		{
		//			if(arr[i]%2==0)
		//			{
		//				arr[e]=arr[i];
		//				e--;
		//			}
		//			else
		//			{
		//				arr[o]=arr[i];
		//				o++;
		//			}
		//		}
		//
		//		System.out.println(Arrays.toString(arr));;

		int []arr=new int[]{1,2,3,4,5,6,7,8,};	
		int o=0;
		int e=arr.length-1;
		while(o<e)
		{
			if(arr[o]%2!=0)
			{
				o++;
			}
			else if(arr[e]%2==0)
			{
				e--;
			}
			else {
				int temp=arr[o];
				arr[o]=arr[e];
				arr[e]=temp;
				o++;
				e++;
				
			}
		}

		System.out.println(Arrays.toString(arr));;
	}
}







