import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of an array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<=arr.length-1; i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
			System.out.println();
		
		
		
		for(int num=1;num<10; num++) 
		{
			int count=0;
			for(int i=0; i<=arr.length-1; i++) 
			{
				int pro=arr[i]%num;
			    if(pro==0)
		       	{
			    	count=count+1;
		       	}
			
			}
		
		System.out.println(num+":"+ count);
		}
		
	}
}	


