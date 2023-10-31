import java.util.Scanner;

public class bigest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5],max;
		System.out.println("Enter the Element");
		Scanner r=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			a[i]=r.nextInt();
		}
		max=a[0];
		for(int i=1;i<=4;i++)
		{
			if(a[i]>=max)
				{
					max=a[i];
				}
			}
		System.out.println("The maximum Element"+max);
		}
	
	}

