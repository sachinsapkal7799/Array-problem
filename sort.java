import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		int temp;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]<a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]+" ");

	}

}
}
