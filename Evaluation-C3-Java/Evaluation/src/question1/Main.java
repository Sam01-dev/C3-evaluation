package question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter the number of elements in the array");
			int size = scanner.nextInt();
			
			int[] arr=new int[size];
			System.out.println("Enter the elements in the array");
			for(int i=0;i<arr.length;i++)
			{
				
				arr[i]=scanner.nextInt();
			}
			
			System.out.println("Enter the index of the array element you want to access");
			String index = scanner.next();
			int in=Integer.parseInt(index);
			System.out.println("The array element at index"+" "+index+" "+"="+" "+arr[in]);
			System.out.println("The array element successfully accessed");

		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a.getClass());
		}
		catch(NumberFormatException n) {
			System.out.println(n.getClass());
		}
	}

}
