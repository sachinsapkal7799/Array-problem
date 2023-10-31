import java.util.Scanner;
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		int n,count=0;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array Element");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Elements ares="+a[i]);
		}
		System.out.println("Enter search element");
		
		
		n=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
		
		if(a[i]==n)
		{
			count++;
		}
		}
		if(count>0)
		{
			System.out.println("Item found");
		}
		else {
			System.out.println("Item  not found");
		}
			
}
	}




		 
		
		
		

	


